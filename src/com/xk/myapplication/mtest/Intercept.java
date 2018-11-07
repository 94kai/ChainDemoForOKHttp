package com.xk.myapplication.mtest;

/**
 * @author xuekai1
 * @date 2018/10/25
 */
public interface Intercept {

    /**
     * 重写该方法，通过chain拿到request，各个拦截器对request进行个性化处理，调用process，让后续的拦截器去处理。拿到response之后，对结果再进行个性化处理，返回。（如果是最后一个拦截器，不调用process方法，直接自己构造出response）
     * @param chain
     * @return
     */
    Reponse intercept(RealChain chain);
}
