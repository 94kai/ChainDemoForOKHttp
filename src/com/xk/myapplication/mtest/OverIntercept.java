package com.xk.myapplication.mtest;

/**
 * @author xuekai1
 * @date 2018/10/25
 */
public class OverIntercept implements Intercept {
    @Override
    public Reponse intercept(RealChain chain) {
        Request request = chain.request;
        request.add("over处理请求信息 ");

        //通过最新的request去构造一个response，而不同于其他拦截器去调用process，让接下来的拦截器去返回response。
        Reponse reponse = new Reponse("over拦截器，最后一个拦截器，直接自己构造一个response。okhttp中类似于callserver拦截器   ");
        return reponse;
    }
}
