package com.example.android.fingerprintdialog

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class FirebaseMessagingServiceImpl : FirebaseMessagingService() {

    override public fun onNewToken(token: String) {
        Log.d(TAG, "Refreshed token: " + token)

        sendRegistrationToServer(token)
    }

    private fun sendRegistrationToServer(token: String) {

    }
}