package com.tiramkanForce;

import android.accounts.AccountsException;
import android.app.Activity;

import com.tiramkanForce.core.BootstrapService;

import java.io.IOException;

public interface BootstrapServiceProvider {
    BootstrapService getService();
}
