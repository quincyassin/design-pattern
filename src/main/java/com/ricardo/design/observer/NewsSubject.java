package com.ricardo.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 新闻 (被观察者)
 */
public class NewsSubject implements Subject {

    /**
     * 观察者列表
     */
    List<ObServer> observers;

    /**
     * 新闻信息(被观察者信息变更)
     */
    public String news;

    public NewsSubject() {
        //初始化观察者列表
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(ObServer observer) {
        //添加观察者
        observers.add(observer);
    }

    @Override
    public void removerObserver(ObServer observer) {
        //移除观察者
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(obServer -> {
            obServer.update(news);
        });
    }

    /**
     * 更新新闻并且通知观察者
     *
     * @param news 新闻
     */
    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
