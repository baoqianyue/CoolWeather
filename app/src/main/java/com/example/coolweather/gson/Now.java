package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 鲍骞月 on 2017/3/15.
 */

public class Now {
    @SerializedName("tmp")
    public String tmperature;
    @SerializedName("cond")
    public More more;


    private class More {
        @SerializedName("txt")
        public String info;
    }
}
