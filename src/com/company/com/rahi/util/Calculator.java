package com.company.com.rahi.util;

import com.company.com.rahi.util.internal.AddHelper;

public class Calculator {

    AddHelper addHelper = new AddHelper();

    public int add(int i, int j){
        return addHelper.add(i, j);
    }
}
