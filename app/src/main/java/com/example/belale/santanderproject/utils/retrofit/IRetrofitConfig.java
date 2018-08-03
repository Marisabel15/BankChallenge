package com.example.belale.santanderproject.utils.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public interface IRetrofitConfig {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Routers.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
