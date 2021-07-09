package com.example.service

import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this, MyService::class.java)
            startService(intent)
   //         isInstalledApp("com.kakao.talk")
        }

    }

//    private fun requestTestApp() {
//        val schemeUrl = "test_scheme://test_action"
//
//        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(schemeUrl))
//        startActivity(intent)
//    }
//
//    private fun isInstalledApp(packageName: String) {
//        val intent = pack.getLaunchIntentForPackage(packageName)
//        startActivity(intent)
//        //return intent != null
//    }


//    fun getTestAppInfo() {
//        if (isInstalledApp("com.instagram.android")) {
//            //requestTestApp()
//            Log.d("testtest", "설치됨")
//        } else {
//            Log.d("testtest", "설치안됨")
//        }
//    }


}