package com.example.tiancai.intentreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Tiancai on 2017/4/26.
 */

public class Activity extends BroadcastReceiver{
    public void onReceive(Context context, Intent intent){
        String value = intent.getStringExtra("testIntent");
        Log.e("IntentReceiver-->Test",value);
    }
}
