package com.cesar.mvp.element.main.interactor;

import android.util.Log;

import com.cesar.mvp.element.main.presenter.MainPresenterImpl;
import com.cesar.mvp.element.main.repository.MainRepositoryImpl;

import java.util.ArrayList;

import model.Interest;

public class MainInteractorImpl implements MainInteractor {

    private MainPresenterImpl mainPresenter;
    private MainRepositoryImpl mainRepository;

    public MainInteractorImpl(MainPresenterImpl mainPresenter) {
        this.mainPresenter = mainPresenter;
        this.mainRepository = new MainRepositoryImpl(this);
    }

    public void getJson() {
         mainRepository.getJson();
    }

    public void mostrarInteres (ArrayList<Interest> intereses){
        mainPresenter.send(intereses);
    }










    public MainRepositoryImpl getMainRepository() {
        return mainRepository;
    }
}
