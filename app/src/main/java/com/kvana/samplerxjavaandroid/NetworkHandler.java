package com.kvana.samplerxjavaandroid;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkHandler {

    private static final NetworkHandler ourInstance = new NetworkHandler();
    private Retrofit mRetrofit = new Retrofit.Builder()
            .baseUrl(IpApi.BASE_URL)
            .addConverterFactory(StringConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public IpApi ipApi = mRetrofit.create(IpApi.class);

    public IpApi getIpInfoApi() {
        return ipApi;
    }

    public NetworkHandler() {
    }

    public static NetworkHandler instance() {
        return ourInstance;
    }
}
