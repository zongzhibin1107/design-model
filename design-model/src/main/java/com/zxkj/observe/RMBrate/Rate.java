package com.zxkj.observe.RMBrate;

import java.util.ArrayList;
import java.util.List;

public abstract class Rate {

    public List<Company> companys=new ArrayList<Company>();

    public void add(Company company)
    {
        companys.add(company);
    }

    public void remove(Company company)
    {
        companys.remove(company);
    }

    public abstract void change(int number);
}
