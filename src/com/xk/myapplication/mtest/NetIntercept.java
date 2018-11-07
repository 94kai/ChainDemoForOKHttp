package com.xk.myapplication.mtest;

/**
 * @author xuekai1
 * @date 2018/10/25
 */
public class NetIntercept implements Intercept {
    @Override
    public Reponse intercept(RealChain chain) {
        Request request = chain.request;
        request.add("net处理请求信息 ");
        Reponse processed = chain.processed(request);
        processed.addContent("网络拦截器处理响应内容 ");
        return processed;
    }
}
