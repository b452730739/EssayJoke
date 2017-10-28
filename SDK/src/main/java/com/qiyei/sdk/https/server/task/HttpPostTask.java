package com.qiyei.sdk.https.server.task;

import com.qiyei.sdk.https.api.listener.IHttpListener;
import com.qiyei.sdk.https.api.request.HttpPostRequest;
import com.qiyei.sdk.https.base.Http;

/**
 * @author Created by qiyei2015 on 2017/10/23.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */
public class HttpPostTask<T> extends HttpTask {

    /**
     * Http post请求
     */
    private HttpPostRequest<T> mRequest;

    /**
     * 构造方法
     * @param request
     */
    public HttpPostTask(HttpPostRequest<T> request, IHttpListener listener) {
        super(Http.POST,listener);
        mRequest = request;
    }

    /**
     * @return {@link #mRequest}
     */
    @Override
    public HttpPostRequest<T> getRequest() {
        return mRequest;
    }

}