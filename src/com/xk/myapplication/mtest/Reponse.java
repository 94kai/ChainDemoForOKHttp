package com.xk.myapplication.mtest;

/**
 * @author xuekai1
 * @date 2018/10/25
 */
public class Reponse {
    String content="response<-";

    public Reponse(String content) {
        this.content += content;
    }

    public void addContent(String content) {
        this.content += content;
    }
    @Override
    public String toString() {
        return content;
    }
}
