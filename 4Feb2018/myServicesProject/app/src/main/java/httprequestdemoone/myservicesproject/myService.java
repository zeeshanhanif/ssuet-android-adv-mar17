package httprequestdemoone.myservicesproject;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Ishaq Hassan on 2/4/2018.
 */

public class myService extends Service
{


    class mythread implements Runnable{
        int serviceId;
        mythread(int s){
            serviceId=s;

        }

        @Override
        public void run() {
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
                stopSelf(serviceId);


            }
        }
    }
    @Override
    public void onCreate() {
        Toast.makeText(this, "Service Started...", Toast.LENGTH_SHORT).show();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

       Thread thread= new Thread(new mythread(startId));
       thread.start();
        return START_STICKY;

    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Stopped...", Toast.LENGTH_SHORT).show();

        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
