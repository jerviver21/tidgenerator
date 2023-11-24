package com.orders.system;

import com.orders.system.lambdas.TidGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println(new TidGenerator().handler());
    }
}