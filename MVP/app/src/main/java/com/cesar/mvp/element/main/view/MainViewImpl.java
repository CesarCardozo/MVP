package com.cesar.mvp.element.main.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cesar.mvp.R;
import com.cesar.mvp.element.main.presenter.MainPresenterImpl;

public class MainViewImpl extends AppCompatActivity implements MainView{

    private MainPresenterImpl mainPresenter;

    private TextView mainViewTextTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenterImpl(this);
        initComponents();

    }

    @Override
    public void initComponents() {
        mainViewTextTest = (TextView) findViewById(R.id.mainViewTextTest);
    }

    @Override
    public void setMessageResponse(String response) {

    }

    @Override
    public void send(View v){
        mainPresenter.getJson();
    }

}