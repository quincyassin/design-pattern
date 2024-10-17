package com.ricardo.design.observer;

public class ObServerMain {

    public static void main(String[] args) {
        NewsSubject newsSubject = new NewsSubject();

        //注册观察者
        Curry curry = new Curry();
        James james = new James();
        newsSubject.registerObserver(james);
        newsSubject.registerObserver(curry);

        //发布新闻
        newsSubject.setNews("first day news");

        //移除james观察者身份
        newsSubject.removerObserver(james);

        //发布新的新闻
        newsSubject.setNews("second day news");
    }
}
