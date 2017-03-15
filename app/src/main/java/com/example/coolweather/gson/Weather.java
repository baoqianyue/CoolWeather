package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 鲍骞月 on 2017/3/15.
 */

public class Weather {
    //返回执行状态，成功返回ok，失败返回具体的原因
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    //因为Forecast中包含的是个数组，所以这里引用的是使用List集合的形式
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
