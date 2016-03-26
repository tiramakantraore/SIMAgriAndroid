
package com.tiramkanForce.core;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import android.widget.Toast;

import com.tiramkanForce.RealmServiceProvider;
import com.tiramkanForce.RetrofitProvider;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Bootstrap API service
 */
public class BootstrapService {

    private RetrofitProvider retrofitProvider;
    private RealmServiceProvider realmServiceProvider;

    /**
     * Create bootstrap service
     * Default CTOR
     */
    public BootstrapService() {
    }

    /**
     * Create bootstrap service
     *
     * @param retrofitProvider The Retrofit that allows HTTP Communication.
     */
    public BootstrapService(RetrofitProvider retrofitProvider, RealmServiceProvider realmServiceProvider ) {
        this.retrofitProvider = retrofitProvider;
        this.realmServiceProvider = realmServiceProvider;
    }

    private UserService getUserService() {
        return getRetrofitProvider().getRetrofit().create(UserService.class);
    }


    private RetrofitProvider getRetrofitProvider() {
        return retrofitProvider;
    }


    /**
     * Get all bootstrap Users that exist on Parse.com
     */
    public RealmResults<User> getUsers() {
        Realm realm = realmServiceProvider.getRealm();
        return realm.allObjects(User.class);
    }
    public void importUsersFromServer(){
        UserService userService= getUserService();

        Call<List<User>> callUsers = userService.getUsers();
        callUsers.enqueue(new Callback<List<User>>()

                            {
                                @Override
                                public void onResponse (Response< List <User>> response, Retrofit retrofit){
                                    List<User> users = response.body();
                                    Realm realm = realmServiceProvider.getRealm();
                                    realm.beginTransaction();
                                    realm.allObjects(User.class).clear();
                                    realm.copyToRealmOrUpdate(users);
                                    realm.commitTransaction();
                                }

                                @Override
                                public void onFailure (Throwable t){
                                    Log.d("USERS", "ERREUR API" + t.getMessage());
                                }
                            }

        );

    }

    public User authenticate(String email, String password) {
        return getUserService().authenticate(email, password);
    }
}