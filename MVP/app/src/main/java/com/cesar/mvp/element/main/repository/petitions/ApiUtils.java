package com.cesar.mvp.element.main.repository.petitions;

public class ApiUtils {

    private ApiUtils() {}


    // public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";

    public static final String BASE_URL = "http://192.168.0.57:5000/";

    public static APIService getAPIService() {

        return RetrofitClient.getInstance(BASE_URL).create(APIService.class);
    }
}
