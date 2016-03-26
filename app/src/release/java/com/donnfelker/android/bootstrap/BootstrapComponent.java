package com.tiramkanForce;

import com.tiramkanForce.authenticator.BootstrapAuthenticatorActivity;
import com.tiramkanForce.core.TimerService;
import com.tiramkanForce.ui.BootstrapActivity;
import com.tiramkanForce.ui.BootstrapFragmentActivity;
import com.tiramkanForce.ui.BootstrapTimerActivity;
import com.tiramkanForce.ui.MainActivity;
import com.tiramkanForce.ui.NavigationDrawerFragment;
import com.tiramkanForce.ui.UserActivity;
import com.tiramkanForce.ui.UserListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AndroidModule.class,
                BootstrapModule.class
        }
)
public interface BootstrapComponent {

    void inject(BootstrapApplication target);

    void inject(BootstrapAuthenticatorActivity target);

    void inject(BootstrapTimerActivity target);

    void inject(MainActivity target);


    void inject(NavigationDrawerFragment target);


    void inject(UserActivity target);

    void inject(UserListFragment target);

    void inject(TimerService target);

    void inject(BootstrapFragmentActivity target);
    void inject(BootstrapActivity target);


}
