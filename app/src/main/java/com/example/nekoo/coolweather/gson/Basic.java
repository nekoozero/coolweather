package com.example.nekoo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Nekoo on 2018/4/10.
 */

public class Basic {
    //使用@SerializedName来让JSON字段和java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
