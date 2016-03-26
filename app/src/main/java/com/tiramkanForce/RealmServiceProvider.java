package com.tiramkanForce;

import io.realm.Realm;

public interface RealmServiceProvider {
    Realm getRealm() ;
    void deleteRealm();
}
