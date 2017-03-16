package com.example.coolweather.gson;

/**
 * Created by 鲍骞月 on 2017/3/15.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String api;
        public String pm25;
    }
}
