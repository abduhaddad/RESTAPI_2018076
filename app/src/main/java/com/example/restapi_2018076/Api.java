package com.example.restapi_2018076;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://cuaca-gempa-rest-api.vercel.app/";
    @GET("quake")
    Call<Results> getKabarGempa();
}
