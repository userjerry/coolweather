package com.coolweather.android.gson;

/**
 * Created by xinxin on 2018/8/14.
 */

public class AQI {

    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
