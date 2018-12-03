package com.cesar.mvp.element.main.repository;

import com.cesar.mvp.element.main.interactor.MainInteractorImpl;
import com.cesar.mvp.element.main.repository.petitions.APIService;
import com.cesar.mvp.element.main.repository.petitions.ApiUtils;
import com.cesar.mvp.element.main.repository.petitions.RetrofitClient;

import java.util.List;

import model.Interest;
import retrofit2.Call;

public class MainRepositoryImpl implements MainRepository {

    private MainInteractorImpl mainInteractor;


    public MainRepositoryImpl(MainInteractorImpl mainInteractor) {
        this.mainInteractor = mainInteractor;
    }

    public String getJson() {
        APIService mAPIService =  ApiUtils.getAPIService();
        Call<List<Interest>> call = mAPIService.getInterests();

        return "";
    }
}
