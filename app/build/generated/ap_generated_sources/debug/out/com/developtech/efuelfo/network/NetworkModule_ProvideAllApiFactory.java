// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.developtech.efuelfo.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class NetworkModule_ProvideAllApiFactory implements Factory<AllApis> {
  private final NetworkModule module;

  private final Provider<Api> apiProvider;

  public NetworkModule_ProvideAllApiFactory(NetworkModule module, Provider<Api> apiProvider) {
    assert module != null;
    this.module = module;
    assert apiProvider != null;
    this.apiProvider = apiProvider;
  }

  @Override
  public AllApis get() {
    return Preconditions.checkNotNull(
        module.provideAllApi(apiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AllApis> create(NetworkModule module, Provider<Api> apiProvider) {
    return new NetworkModule_ProvideAllApiFactory(module, apiProvider);
  }
}