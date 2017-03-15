package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 鲍骞月 on 2017/3/15.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    private class Temperature {
        public String max;
        public String min;
    }

    private class More {
        @SerializedName("txt_d")
        public String info;
    }
}
