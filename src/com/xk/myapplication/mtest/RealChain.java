package com.xk.myapplication.mtest;

import java.util.List;

/**
 * @author xuekai1
 * @date 2018/10/25
 */
public class RealChain {
    Request request;
    List<Intercept> interceptList;
    int index;

    public RealChain(int index, List<Intercept> interceptList, Request request) {
        this.index = index;
        this.interceptList = interceptList;
        this.request = request;
    }

    Reponse processed(Request request) {
        System.out.println(index);
        if (interceptList.size() > index) {
            Intercept intercept = interceptList.get(index);
            Reponse reponse = intercept.intercept(new RealChain(index + 1, interceptList,request));
            return reponse;

        } else {
            //最后一个拦截器，通过某种方式，列如通过网络获取数据
            return new Reponse("通过网络获取的数据 ");
        }
    }
}
