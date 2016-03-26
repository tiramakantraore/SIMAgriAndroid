
package com.tiramkanForce;

import android.accounts.AccountsException;
import android.app.Activity;

import com.tiramkanForce.authenticator.ApiKeyProvider;
import com.tiramkanForce.core.BootstrapService;

import java.io.IOException;

import retrofit.Retrofit;

/**
 * Provider for a {@link com.tiramkanForce.core.BootstrapService} instance
 */
public class BootstrapServiceProviderImpl implements BootstrapServiceProvider {

    private RetrofitProvider retrofitProvider;
    private ApiKeyProvider keyProvider;
    private RealmServiceProvider realmServiceProvider;

    public BootstrapServiceProviderImpl(RetrofitProvider retrofitProvider, ApiKeyProvider keyProvider, RealmServiceProvider realmServiceProvider) {
        this.retrofitProvider = retrofitProvider;
        this.keyProvider = keyProvider;
        this.realmServiceProvider = realmServiceProvider;
    }

    /**
     * Get service for configured key provider
     * <p/>
     * This method gets an auth key and so it blocks and shouldn't be called on the main thread.
     *
     * @return bootstrap service
     * @throws IOException
     * @throws AccountsException
     */
    @Override
    public BootstrapService getService(){

        return new BootstrapService(retrofitProvider,realmServiceProvider);
    }
}
