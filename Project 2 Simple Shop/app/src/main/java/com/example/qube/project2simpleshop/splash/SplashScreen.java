package com.example.qube.project2simpleshop.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.qube.project2simpleshop.R;
import com.example.qube.project2simpleshop.main.MainActivity;

/**
 * Created by Qube on 8/20/16.
 */
public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
