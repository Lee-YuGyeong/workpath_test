package com.example.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("testtest","Service On")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        var i=0
        while(true){
            i++
            Log.d("testtest","Service 실행 중 : $i")
        }

//        for (i in 1..30){
//            Log.d("testtest","Service 실행 중 : $i")
//        }

        return super.onStartCommand(intent, flags, startId)

    }

    override fun onDestroy() {
        super.onDestroy()
    }
}