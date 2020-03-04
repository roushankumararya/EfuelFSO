// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.developtech.efuelfo.util;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SPUtils_Factory implements Factory<SPUtils> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SPUtils_Factory(Provider<SharedPreferences> sharedPreferencesProvider) {
    assert sharedPreferencesProvider != null;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SPUtils get() {
    return new SPUtils(sharedPreferencesProvider.get());
  }

  public static Factory<SPUtils> create(Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SPUtils_Factory(sharedPreferencesProvider);
  }
}