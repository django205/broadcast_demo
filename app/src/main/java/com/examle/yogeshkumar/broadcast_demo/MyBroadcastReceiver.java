package com.examle.yogeshkumar.broadcast_demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Yogesh Kumar on 4/5/2017.
 */

public class MyBroadcastReceiver  extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "something happened!!May be my broadcast!!", Toast.LENGTH_LONG).show();
    }
}
