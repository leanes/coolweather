package com.qnear.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.qnear.coolweather.service.AutoUpdateService;

/**
 * Created by 陈振聪 on 2016/8/6.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context , AutoUpdateService.class) ;
        context.startService(i) ;
    }
}
