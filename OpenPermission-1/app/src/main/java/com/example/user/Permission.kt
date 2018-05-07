package com.example.user

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.app.ActivityCompat
import android.util.Log


class Permission{

    private val tag = "Permission message"


    private val userMicrophonePermissionAgreeCode = 1
    private val userCameraPermissionAgreeCode = 2

    fun askMicrophonePermission(context: Context){
        val currentMicrophonePermission = ActivityCompat.checkSelfPermission(context,android.Manifest.permission.RECORD_AUDIO)
        if(currentMicrophonePermission != PackageManager.PERMISSION_GRANTED)
            //  進入 MainActivity 的 onRequestPermissionsResult
            ActivityCompat.requestPermissions(context as Activity, arrayOf(android.Manifest.permission.RECORD_AUDIO), userMicrophonePermissionAgreeCode)
    }

    fun askCameraPermission(context: Context){
        val currentCameraPermission = ActivityCompat.checkSelfPermission(context,android.Manifest.permission.CAMERA)
        if(currentCameraPermission != PackageManager.PERMISSION_GRANTED)
        //  進入 MainActivity 的 onRequestPermissionsResult
            ActivityCompat.requestPermissions(context as Activity, arrayOf(android.Manifest.permission.CAMERA), userCameraPermissionAgreeCode)
    }

    fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {

        //  看一下這是甚麼
        Log.i(tag,permissions.toString())

        when(requestCode){
            userMicrophonePermissionAgreeCode -> {
                if( grantResults[0] == PackageManager.PERMISSION_GRANTED )
                    Log.i(tag,"Agree microphone permission")
                else
                    Log.i(tag,"Not agree microphone permission")
            }
            userCameraPermissionAgreeCode -> {
                if( grantResults[0] == PackageManager.PERMISSION_GRANTED )
                    Log.i(tag,"Agree camera permission")
                else
                    Log.i(tag,"Not agree camera permission")
            }
        }
    }
}