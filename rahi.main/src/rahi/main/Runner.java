package rahi.main;

import rahi.util.Calculator;

public class Runner {
    public static void main( String[] args ) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4, 5));
    }
}
