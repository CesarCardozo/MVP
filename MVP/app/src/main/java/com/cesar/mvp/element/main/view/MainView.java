package com.cesar.mvp.element.main.view;

import android.view.View;

public interface MainView {

    void initComponents();
    void setMessageResponse(String response);
    void send(View v);

}
