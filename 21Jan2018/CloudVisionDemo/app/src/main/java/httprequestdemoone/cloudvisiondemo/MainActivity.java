package httprequestdemoone.cloudvisiondemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Calendar;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.entity.StringEntity;

public class MainActivity extends AppCompatActivity {
    Uri uriFilePath;
    int CAMERA_REQ = 100;
    ImageView picturePreview;
    String API_KEY = "YOUR_API_KEY";
    private static String visionEndpoint = "https://vision.googleapis.com/v1/images:annotate?key=";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visionEndpoint+=API_KEY;
        Button takePicBtn = findViewById(R.id.takePicBtn);
        picturePreview = findViewById(R.id.picturePreview);

        takePicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePic();
            }
        });
    }

    private void postToVision(String base64){
        try {
            JSONObject rootObject = new JSONObject();
            JSONArray requestsArray = new JSONArray();
            JSONObject requestObject = new JSONObject();

            JSONObject imageContentObject = new JSONObject();
            imageContentObject.put("content",base64);
            requestObject.put("image",imageContentObject);

            JSONArray featuresArray = new JSONArray();
            JSONObject feature = new JSONObject();
            feature.put("type","TEXT_DETECTION");
            featuresArray.put(feature);
            requestObject.put("features",featuresArray);

            requestsArray.put(requestObject);

            rootObject.put("requests", requestsArray);
            Log.e("Prepared JSON",rootObject.toString());

            StringEntity postData = new StringEntity(rootObject.toString());

            AsyncHttpClient client = new AsyncHttpClient();
            client.post(this,visionEndpoint,postData,"application/json",new AsyncHttpResponseHandler(){

                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    String response = new String(responseBody);
                    try{
                        JSONObject jsonObject = new JSONObject(response);
                        JSONArray responses = jsonObject.getJSONArray("responses");
                        JSONObject firstObj = responses.getJSONObject(0);
                        JSONArray textAnnotations = firstObj.getJSONArray("textAnnotations");
                        JSONObject finalObject = textAnnotations.getJSONObject(0);
                        String finalResultText = finalObject.getString("description");
                        TextView responseTv = findViewById(R.id.response);
                        responseTv.setText(finalResultText);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    Log.e("Vision Response",response);
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    String response = new String(responseBody);
                    Log.e("Vision Faliure",response);
                }
            });

        } catch (Exception e){
            e.printStackTrace();
        }
    }


    private void takePic(){
        File mainDirectory = new File(Environment.getExternalStorageDirectory(), "MyFolder/tmp");
        if (!mainDirectory.exists())
            mainDirectory.mkdirs();

        Calendar calendar = Calendar.getInstance();

        uriFilePath = Uri.fromFile(new File(mainDirectory, "IMG_" + calendar.getTimeInMillis()));
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, uriFilePath);
        startActivityForResult(intent, CAMERA_REQ);
    }

    private String encodeToBase64(String path) throws Exception{
        Bitmap bm = BitmapFactory.decodeFile(path);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bm.compress(Bitmap.CompressFormat.JPEG, 50, baos); //bm is the bitmap object
        picturePreview.setImageBitmap(bm);
        byte[] b = baos.toByteArray();
        return Base64.encodeToString(b, Base64.DEFAULT);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            if (requestCode == CAMERA_REQ) {
                String filePath = uriFilePath.getPath(); // Here is path of your captured image, so you can create bitmap from it, etc.
                try {
                    postToVision(encodeToBase64(filePath));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
