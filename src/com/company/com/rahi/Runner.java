package com.company.com.rahi;

import com.company.com.rahi.util.Calculator;

public class Runner {

    public static void main( String[] args ) {
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 5);
        System.out.println(result);
    }
}
