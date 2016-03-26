package com.tiramkanForce;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.telephony.TelephonyManager;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.tiramkanForce.authenticator.ApiKeyProvider;
import com.tiramkanForce.authenticator.LogoutService;
import com.tiramkanForce.authenticator.LogoutServiceImpl;
import com.tiramkanForce.core.BootstrapService;
import com.tiramkanForce.core.PostFromAnyThreadBus;
import com.tiramkanForce.core.UserAgentProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.RealmObject;
import retrofit.Retrofit;

/**
 * Dagger module for setting up provides statements.
 * Register all of your entry points below.
 */
@Module
public class BootstrapModule {

    @Singleton
    @Provides
    Bus provideOttoBus() {
        return new PostFromAnyThreadBus();
    }

    @Provides
    @Singleton
    LogoutService provideLogoutService(final Context context, final AccountManager accountManager) {
        return new LogoutServiceImpl(context, accountManager);
    }

    @Provides
    RealmServiceProvider provideRealmServiceProvider(final Context context) {
        return new RealmServiceProviderImpl(context);
    }

//    @Provides
//    BootstrapService provideBootstrapService(RetrofitProvider retrofitProvider, RealmServiceProvider realmServiceProvider) {
//        return new BootstrapService(retrofitProvider,realmServiceProvider);
//
//    }

    @Provides
    BootstrapServiceProvider provideBootstrapServiceProvider(RetrofitProvider retrofitProvider, ApiKeyProvider apiKeyProvider, RealmServiceProvider realmServiceProvider) {
        return new BootstrapServiceProviderImpl(retrofitProvider, apiKeyProvider, realmServiceProvider);
    }

    @Provides
    ApiKeyProvider provideApiKeyProvider(AccountManager accountManager) {
        return new ApiKeyProvider(accountManager);
    }
    @Provides
    APIAuthenticator provideAPIAuthenticator() {
        return new APIAuthenticatorImpl();
    }


    @Provides
    Gson provideGson() {
        return new GsonBuilder().setDateFormat("dd-MM-yyyy").setExclusionStrategies(new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes f) {
                return f.getDeclaringClass().equals(RealmObject.class);
            }

            @Override
            public boolean shouldSkipClass(Class<?> clazz) {
                return false;
            }
        }).create();
        /**
         * GSON instance to use for all request  with date format set up for proper parsing.
         * <p/>
         * You can also configure GSON with different naming policies for your API.
         * Maybe your API is Rails API and all json values are lower case with an underscore,
         * like this "first_name" instead of "firstName".
         * You can configure GSON as such below.
         * <p/>
         *
         * public static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd")
         *         .setFieldNamingPolicy(LOWER_CASE_WITH_UNDERSCORES).create();
         */
    }


    @Provides
    UserAgentProvider providesUserAgentProvider(ApplicationInfo appInfo, PackageInfo packageInfo, TelephonyManager telephonyManager, ClassLoader classLoader) {
        return new UserAgentProvider(appInfo, packageInfo, telephonyManager, classLoader);
    }

    @Provides
    RetrofitProvider provideRetrofitProvider(Gson gson, APIAuthenticator authenticator ) {
        return new RetrofitProviderImpl(gson,authenticator);
    }

}
