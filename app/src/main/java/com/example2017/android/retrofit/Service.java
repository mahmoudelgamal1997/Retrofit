package com.example2017.android.retrofit;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by M7moud on 27-Oct-18.
 */
public interface Service {
    String baseURL="https://api.github.com/users/";

    @GET("mahmoudelgamal1997/repos")
    Call<ArrayList<Example>> method();
}
