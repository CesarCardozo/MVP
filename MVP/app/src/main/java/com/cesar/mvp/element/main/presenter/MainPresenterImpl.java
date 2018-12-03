package com.cesar.mvp.element.main.presenter;

import com.cesar.mvp.element.main.interactor.MainInteractorImpl;
import com.cesar.mvp.element.main.view.MainViewImpl;

public class MainPresenterImpl implements MainPresenter {

    private MainInteractorImpl mainInteractor;
    private MainViewImpl mainView;

     public MainPresenterImpl(MainViewImpl mainView) {
        this.mainView = mainView;
        mainInteractor = new MainInteractorImpl(this);
     }

    public void getJson() {
         mainView.setMessageResponse(mainInteractor.getJson());

    }
}
