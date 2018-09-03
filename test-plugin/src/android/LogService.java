package com.example;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import java.lang.InterruptedException;
import java.lang.Thread;

public class LogService extends IntentService {
    
    public LogService() {
        super("LogServie");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            while(true) {
                Thread.sleep(1000);
                Log.d("TestPlugin", "Service running...");
            }
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}