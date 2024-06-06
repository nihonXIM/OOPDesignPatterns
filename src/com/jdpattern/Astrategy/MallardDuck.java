package com.jdpattern.Astrategy;

/**
 * JAVA DESIGN PATTERN
 * https://docs.google.com/presentation/d/1vRkhNgO9a-En6CH3YIr-Mn9I2AZroEa_/edit?usp=sharing&ouid=114745490339029817474&rtpof=true&sd=true
 */
public class MallardDuck extends Duck {

    public MallardDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();


    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
