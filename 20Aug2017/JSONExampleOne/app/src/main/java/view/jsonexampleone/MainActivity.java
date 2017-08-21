package view.jsonexampleone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    String json = "{'name':'MainActivityMainActivityMainActivity','friends':['Friend One','Friend Two','Friend Three']}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.myJsonStr);

        try {
            JSONObject jsonObject = new JSONObject(json);
            String nameStr = jsonObject.getString("name");
            String[] friends = new String[jsonObject.getJSONArray("friends").length()];
            String friendsStr = "";
            for(int fi = 0;fi<jsonObject.getJSONArray("friends").length();fi++){
                friends[fi] = jsonObject.getJSONArray("friends").getString(fi);
                friendsStr += friends[fi]+",";
            }
            textView.setText(nameStr+"\n\n"+friendsStr);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
