package com.example.eve.justweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    //Json中的一些字段可能不太适合直接作为Java字段命名
    //使用@SerializedName注解建立json和java之间映射
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
