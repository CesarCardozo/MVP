package com.cesar.mvp.element.main.interactor;

import com.cesar.mvp.element.main.presenter.MainPresenterImpl;
import com.cesar.mvp.element.main.repository.MainRepositoryImpl;

public class MainInteractorImpl implements MainInteractor {

    private MainPresenterImpl mainPresenter;
    private MainRepositoryImpl mainRepository;

    public MainInteractorImpl(MainPresenterImpl mainPresenter) {
        this.mainPresenter = mainPresenter;
        this.mainRepository = new MainRepositoryImpl(this);
    }

    public String getJson() {
        return mainRepository.getJson();
    }
}
