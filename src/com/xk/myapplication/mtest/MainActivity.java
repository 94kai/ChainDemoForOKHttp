package com.xk.myapplication.mtest;

import java.util.ArrayList;

/**
 * @author xuekai1
 * @date 2018/10/22
 */
public class MainActivity  {
    public static void main(String[] args) {

        ArrayList<Intercept> intercepts = new ArrayList<>();

        intercepts.add(new CacheIntercept());

        intercepts.add(new Intercept() {
            @Override
            public Reponse intercept(RealChain chain) {
                Request request = chain.request;

                request.add("自定义拦截器加工request  ");
                Reponse reponse = chain.processed(request);

                reponse.addContent("自定义拦截器加工response  ");
                return reponse;
            }
        });
        intercepts.add(new NetIntercept());
        intercepts.add(new OverIntercept());
        Request request = new Request();
        RealChain realChain = new RealChain(0,intercepts,request);
        Reponse response = realChain.processed(request);


        System.out.println(request);
        System.out.println(response);
    }


}
