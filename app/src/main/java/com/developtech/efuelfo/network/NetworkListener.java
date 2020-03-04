package com.developtech.efuelfo.network;

import com.developtech.efuelfo.model.ResultModel;

/**
 * Created by dt on 1/9/18.
 */

public interface NetworkListener {
    public void onSuccess(ResultModel<?> responseBody);

    public void onError(String msg);

    public void onComplete();

    public void onStart();
}