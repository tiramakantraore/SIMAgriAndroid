package com.tiramkanForce;

import android.util.Base64;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.tiramkanForce.core.Constants;

import java.io.IOException;

import io.realm.RealmObject;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by tiramakan on 19/12/2015.
 */
public class RetrofitProviderImpl implements RetrofitProvider{
    private Gson gson;
    private APIAuthenticator authenticator;
    public static final String API_BASE_URL = Constants.Http.URL_BASE;//Pour bluestack et android emulator
  //  public static final String API_BASE_URL = "http://10.0.3.2:9191/"; Pour genymotion
    RetrofitProviderImpl(Gson gson, APIAuthenticator authenticator){
        this.gson=gson;
        this.authenticator=authenticator;

    }

    @Override
    public Retrofit getRetrofit()  {
        Retrofit.Builder builder;
        OkHttpClient httpClient = new OkHttpClient();
        String username= authenticator.getLogin();
        String password= authenticator.getPassword();
        if (username != null && password != null) {
            String credentials = username + ":" + password;
            final String basic =
                    "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);

            httpClient.interceptors().clear();
            httpClient.interceptors().add(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request original = chain.request();
                    Request.Builder requestBuilder = original.newBuilder().addHeader("Authorization", basic)
                            .addHeader("Accept", "application/json")
                            .method(original.method(), original.body());

                    Request request = requestBuilder.build();
                    return chain.proceed(request);
                }
            });
        }
        builder =
                new Retrofit.Builder()
                        .baseUrl(API_BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create(gson));
        Retrofit retrofit = builder.client(httpClient).build();
        return retrofit;
    }
}
