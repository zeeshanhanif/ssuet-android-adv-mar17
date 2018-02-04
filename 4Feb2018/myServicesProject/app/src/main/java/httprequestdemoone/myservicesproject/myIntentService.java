package httprequestdemoone.myservicesproject;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Ishaq Hassan on 2/4/2018.
 */

public class myIntentService extends IntentService{

    @Override
    public void onCreate() {
        Toast.makeText(this, " Intent Service Started...", Toast.LENGTH_SHORT).show();

        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, " Intent Service stopped...", Toast.LENGTH_SHORT).show();

        super.onDestroy();
    }

    @Override
    public void onStart(@Nullable Intent intent, int startId) {
        super.onStart(intent, startId);
    }




    public myIntentService() {
        super("my intent thread");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        synchronized (this){
            int count=0;
            while(count<10){


                try {
                    wait(1500);
                    count++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
          //  stopSelf(serviceId);


        }

    }
}
