package com.cesar.mvp.element.main.repository;

import android.app.Service;
import android.util.Log;

import com.cesar.mvp.element.main.interactor.MainInteractorImpl;
import com.cesar.mvp.element.main.repository.petitions.APIService;
import com.cesar.mvp.element.main.repository.petitions.ApiUtils;
import com.cesar.mvp.element.main.repository.petitions.JsonManager;
import com.cesar.mvp.element.main.repository.petitions.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import model.Interest;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainRepositoryImpl implements MainRepository {

    private MainInteractorImpl mainInteractor;


    public MainRepositoryImpl(MainInteractorImpl mainInteractor) {
        this.mainInteractor = mainInteractor;
    }

    public void getJson() {
        APIService mAPIService =  ApiUtils.getAPIService();
        Call<List<Interest>> call = mAPIService.getInterests();
        final ArrayList<Interest> interests = new ArrayList<>();
        call.enqueue(new Callback<List<Interest>>() {
            @Override
            public void onResponse(Call<List<Interest>> call, Response<List<Interest>> response) {

                if (!response.isSuccessful()){
                    Log.i("TAG", "Error" + response.code());
                }else{
                    List<Interest> post = response.body();
                    for (Interest i : post){

                        Interest interest = new Interest(i.getIdInterest(), i.getNameInterests());
                      interests.add(interest);
                    }
                }
                mainInteractor.mostrarInteres(interests);
            }

            @Override
            public void onFailure(Call<List<Interest>> call, Throwable t) {
                Log.e("TAG", "Error" + t.getMessage());
            }
        });
    }


    public void postInterest(Interest i) {
        APIService mAPIService =  ApiUtils.getAPIService();
        mAPIService.sendInterest(i).enqueue(new Callback<Interest>() {
            @Override
            public void onResponse(Call<Interest> call, Response<Interest> response) {
                if (response.isSuccessful()){
                    Log.e("tag","post submitted to API." + response.body());
                }
            }

            @Override
            public void onFailure(Call<Interest> call, Throwable t) {
                Log.e("TAG", "Error" + t.getMessage());
            }
        });
    }
}
