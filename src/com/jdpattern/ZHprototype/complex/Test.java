package com.jdpattern.ZHprototype.complex;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Complex com = new Complex("Complex");
        System.out.println(com.getDate() + com.getComplexInfo());
        try {
            Complex cloned1 = (Complex) com.clone();
            cloned1.setDate(new Date(2008, 0, 1));

            Complex cloned2 = (Complex) com.clone();
            cloned2.setDate(new Date(2008, 2, 1));

            System.out.println(cloned1.getDate() + cloned1.getComplexInfo());
            System.out.println(cloned2.getDate() + cloned2.getComplexInfo());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}