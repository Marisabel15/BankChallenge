package com.example.belale.santanderproject.utils.retrofit;

import com.example.belale.santanderproject.models.Cell;
import com.example.belale.santanderproject.models.Fund;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Routers {

    String BASE_URL = "https://floating-mountain-50292.herokuapp.com/";

    @GET("cells.json")
    Call<List<Cell>> getCell();

    @GET("fund.json")
    Call<Fund> getFund();

}


