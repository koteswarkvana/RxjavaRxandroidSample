package com.kvana.samplerxjavaandroid;


import retrofit2.http.GET;
import rx.Observable;

public interface IpApi {
    public String BASE_URL  = "https://ipapi.co";

    @GET("/json")
    Observable<String> updateUser();
}
