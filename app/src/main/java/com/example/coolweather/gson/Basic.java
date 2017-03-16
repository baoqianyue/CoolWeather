package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 鲍骞月 on 2017/3/15.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;


    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
