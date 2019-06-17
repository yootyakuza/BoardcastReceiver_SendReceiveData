package com.example.app2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Anunda","Data Received from App 1: " + intent.getAction());
        Log.d("Anunda","Data Received from App 1: " + intent.getStringExtra("data"));
    }
}
