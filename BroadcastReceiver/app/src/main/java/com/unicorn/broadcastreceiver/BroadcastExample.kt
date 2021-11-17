package com.unicorn.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastExample: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val isAirplaneMode: Boolean = intent!!.getBooleanExtra("state", false)

        if (isAirplaneMode){
            Toast.makeText(context, "Airplane mode is ACTIVATED!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "Airplane mode is off.", Toast.LENGTH_SHORT).show()
        }
    }
}