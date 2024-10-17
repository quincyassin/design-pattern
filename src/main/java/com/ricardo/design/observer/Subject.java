package com.ricardo.design.observer;

/**
 * 被观察者
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * @param observer
     */
    void registerObserver(ObServer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removerObserver(ObServer observer);

    /**
     * 通知观察者 被观察者变化
     */
    void notifyObservers();


}
