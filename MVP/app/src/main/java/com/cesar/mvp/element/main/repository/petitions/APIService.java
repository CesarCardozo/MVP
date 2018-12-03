package com.cesar.mvp.element.main.repository.petitions;

import java.util.List;

import model.Interest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIService {

    @GET("/getInterests")
    Call<List<Interest>> getInterests();


    @POST("/addInterest")
    Call<Interest> sendInterest(@Body Interest idInterest);
}