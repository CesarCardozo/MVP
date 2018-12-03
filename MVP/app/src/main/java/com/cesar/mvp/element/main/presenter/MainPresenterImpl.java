package com.cesar.mvp.element.main.presenter;

import android.util.Log;

import com.cesar.mvp.element.main.interactor.MainInteractorImpl;
import com.cesar.mvp.element.main.repository.petitions.JsonManager;
import com.cesar.mvp.element.main.view.MainViewImpl;

import java.util.ArrayList;

import model.Interest;

public class MainPresenterImpl implements MainPresenter {

    private MainInteractorImpl mainInteractor;
    private MainViewImpl mainView;

     public MainPresenterImpl(MainViewImpl mainView) {
        this.mainView = mainView;
        mainInteractor = new MainInteractorImpl(this);
     }

    public void getJson() {
        mainInteractor.getJson();
    }

    public void send(ArrayList<Interest> intereses) {
         mainView.setMessageResponse(JsonManager.printJson(intereses));
    }

    public void send(String s, String s1) {
        mainInteractor.postInterest(s,s1);
     }
}
