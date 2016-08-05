package com.qnear.coolweather.util;

/**
 * Created by 陈振聪 on 2016/8/4.
 */
public interface HttpCallbackListener {
    void onFinish(String response) ;
    void onError(Exception e) ;
}
