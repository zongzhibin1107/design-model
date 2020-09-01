package com.zxkj.observe.crudeOilFutures;

import java.util.Observer;

public class CrudeOilFuturesMain {

    public static void main(String[] args) {

        OilFutures oil=new OilFutures();
        Observer bull=new Bull(); //多方
        Observer bear=new Bear(); //空方
        oil.addObserver(bull);
        oil.addObserver(bear);

        oil.setPrice(10);
        oil.setPrice(-8);
    }
}
