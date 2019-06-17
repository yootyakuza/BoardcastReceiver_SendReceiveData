# BoardcastReceiver_SendReceiveData

# App1

 val intent = Intent()
            intent.action = "com.example.app1"
            //intent.action = Intent.ACTION_SEND
            intent.putExtra("data", "data send")
            intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
            intent.component = ComponentName("com.example.app2", "com.example.app2.MyBroadcastReceiver")
            sendBroadcast(intent)
