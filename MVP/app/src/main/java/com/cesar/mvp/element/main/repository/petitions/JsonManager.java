package com.cesar.mvp.element.main.repository.petitions;

import com.google.gson.Gson;

public class JsonManager {

    public static String printJson(Object object){
        Gson gson = new Gson();
        return gson.toJson(object);
    }
}
