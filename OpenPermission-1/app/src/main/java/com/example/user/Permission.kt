package com.example.user

import android.app.Activity
import android.content.pm.PackageManager
import android.support.v4.app.ActivityCompat


class Permission{
    fun askMicrophonePermission(){

        val userMicrophonePermissionAgreeCode = 1
        val currentMicrophonePermission = ActivityCompat.checkSelfPermission(_________,android.Manifest.permission.RECORD_AUDIO)
        if(currentMicrophonePermission!=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(_______________, arrayOf(android.Manifest.permission.RECORD_AUDIO), userMicrophonePermissionAgreeCode)
        }
    }
}