package com.xk.myapplication.mtest;

/**
 * @author xuekai1
 * @date 2018/10/25
 */
public class Request {

    String contnet = "request->";

    public Request() {
    }

    @Override
    public String toString() {
        return contnet;
    }

    public void add(String content) {
        contnet += content;
    }
}
