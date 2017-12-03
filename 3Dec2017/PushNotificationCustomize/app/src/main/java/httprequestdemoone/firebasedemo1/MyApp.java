package httprequestdemoone.firebasedemo1;

import android.app.Application;

import com.onesignal.OneSignal;

/**
 * Created by Ishaq Hassan on 12/3/2017.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }
}
