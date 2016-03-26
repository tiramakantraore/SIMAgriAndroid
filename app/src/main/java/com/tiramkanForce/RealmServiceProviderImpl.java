package com.tiramkanForce;

import android.content.Context;
import android.util.Base64;

import com.google.gson.Gson;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.tiramkanForce.core.Constants;

import java.io.IOException;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmMigrationNeededException;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by tiramakan on 19/12/2015.
 */
public class RealmServiceProviderImpl implements RealmServiceProvider{
    private Context context;
    RealmServiceProviderImpl(Context context){
        this.context=context;
    }


    @Override
    public Realm getRealm() {
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(context).build();

        try {
            return Realm.getInstance(realmConfiguration);
        } catch (RealmMigrationNeededException e){
            try {
                Realm.deleteRealm(realmConfiguration);
                //Realm file has been deleted.
                return Realm.getInstance(realmConfiguration);
            } catch (Exception ex){
                throw ex;
                //No Realm file to remove.
            }
        }
    }

    @Override
    public void deleteRealm() {
        try {
            Realm realm=Realm.getDefaultInstance();
            if (! realm.isClosed())
                realm.close();
            RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(context).build();
            Realm.deleteRealm(realmConfiguration);
            //Realm file has been deleted.
        } catch (Exception ex) {
            throw ex;
            //No Realm file to remove.
        }
    }
}
