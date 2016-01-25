package com.reidzeibel.teladan48app.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by Reidzeibel on 25/01/2016.
 */
public class RetrofitInstance {

    private static Retrofit retrofitInstance;
    private static Rest service;

    private static final Gson gson = new GsonBuilder().create();


    private static final OkHttpClient defaultHttpClient = new OkHttpClient.Builder()
            .addInterceptor(
                    new Interceptor() {
                        @Override
                        public Response intercept(Interceptor.Chain chain) throws IOException {
                            Request request = chain.request().newBuilder()
                                    .addHeader("Authorization", "Bearer 123456")
                                    .addHeader("Content-Type", "application/json")
                                    .addHeader("Cache-Control", "no-cache").build();
                            return chain.proceed(request);
                        }
                    }).build();

    public static Retrofit getInstance() {
        if (retrofitInstance==null) {
            retrofitInstance = new Retrofit.Builder()
                    .baseUrl(ApiConstants.API_ENDPOINT)
                    .client(defaultHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofitInstance;
    }

    public static Rest get() {
        if (service==null) {
            service = getInstance().create(Rest.class);
        }
        return service;
    }
}
