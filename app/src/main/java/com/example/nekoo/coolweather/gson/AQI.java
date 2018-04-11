package com.example.nekoo.coolweather.gson;

/**
 * Created by Nekoo on 2018/4/10.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
