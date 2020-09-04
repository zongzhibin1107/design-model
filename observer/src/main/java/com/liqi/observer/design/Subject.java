package com.liqi.observer.design;

public interface Subject {
    /**
     * 注册
     */
    void resgisterObserver(Observer observer);

    /**
     * 移除
     */
    void removeObserver(Observer observer);

    /**
     * 通知
     */
    void notifyObservers();
}
