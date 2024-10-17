package com.ricardo.design.observer;

/**
 * 观察者
 */
public interface ObServer {

    /**
     * 观察者接收通知方法
     *
     * @param message 通知信息
     */
    void update(String message);
}
