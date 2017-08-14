package com.edj0707.pigbook;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        startActivity(new Intent(SplashActivity.this, HomeActivity.class));
//                    }
//                });
//            }
//        });
//        thread.start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                Intent
            }
        },2000);

    }
}
