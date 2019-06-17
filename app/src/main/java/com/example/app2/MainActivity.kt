package com.example.app2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var MyReceiver: MyBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyReceiver = MyBroadcastReceiver()
    }

    override fun onDestroy() {
        super.onDestroy()
        if(MyReceiver != null){
            unregisterReceiver(MyReceiver)
        }
    }
}
