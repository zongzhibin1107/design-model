package com.zxkj.observe.RMBrate;

public class RMBrate extends Rate {


    @Override
    public void change(int number) {
        for(Company obs:companys)
        {
            ((Company)obs).response(number);
        }
    }
}
