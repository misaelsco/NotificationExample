package com.example.misael.notificationexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Misael on 01/11/2016.
 */

public class AlarmBroadCustReciver extends BroadcastReceiver {
    public AlarmBroadCustReciver() {
    }

    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm worked.", Toast.LENGTH_LONG).show();
    }
}