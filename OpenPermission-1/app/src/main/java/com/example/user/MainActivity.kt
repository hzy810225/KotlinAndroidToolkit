package com.example.user

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  this@MainActivity 是這個 MainActivity 的環境
        //  進入 Permission().askMicrophonePermission
        Log.i("Message","即將問權限")
        Permission().askMicrophonePermission(this@MainActivity)
        Permission().askCameraPermission(this@MainActivity)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        //  進入 Permission().onRequestPermissionsResult
        Permission().onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
}
