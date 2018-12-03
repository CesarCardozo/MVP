package com.cesar.mvp.element.main.repository.petitions;

import java.util.List;

import model.Interest;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("/getInterests")
    Call<List<Interest>> getInterests();

}