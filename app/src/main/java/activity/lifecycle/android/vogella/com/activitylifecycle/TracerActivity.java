package activity.lifecycle.android.vogella.com.activitylifecycle;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;

/**
 * Created by SterlingRyan on 28/11/2016.
 */

public class TracerActivity extends AppCompatActivity {
    private static int notificationID = 1;


    private void createNotification(String content){
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        mBuilder.setSmallIcon(R.mipmap.ic_launcher);
        mBuilder.setContentTitle("Vogella Activity Lifecycle");
        mBuilder.setContentText(content);
        notificationManager.notify(notificationID, mBuilder.build());

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createNotification("onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        createNotification("onCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        createNotification("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        createNotification("onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        createNotification("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        createNotification("onDestroy");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        createNotification("onRestoreInstanceState");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        createNotification("onSaveInstanceState");
    }
}
