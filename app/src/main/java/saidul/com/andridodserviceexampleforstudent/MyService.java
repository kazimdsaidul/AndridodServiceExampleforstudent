package saidul.com.andridodserviceexampleforstudent;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by Kazi Md. Saidul Email: Kazimdsaidul@gmail.com  Mobile: +8801675349882 on 7/21/17.
 */

public class MyService extends Service {
    private static final String TAG = "TAG";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG, "onCreate: ");



        //stopSelf();


    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.e(TAG, "onStart: ");


        int counter = intent.getExtras().getInt("counter");

        for (int i = 0 ; i<=counter;i++){
            Log.e(TAG, "counter: "+i );
        }

        stopSelf();

    }



    @Override
    public IBinder onBind(Intent intent) {
        Log.e(TAG, "onStart: ");

        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.e(TAG, "onDestroy: ");
    }
}
