package com.jdpattern.Kproxy.refl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ReflectionTestDrive {


    public static void main(String[] args) {

        ReflectionTestDrive t = new ReflectionTestDrive();
        try {

            t.AccoutReflection();
            t.FlyableProxy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AccoutReflection() throws Exception {
        Account account = new Account("10", "finance", "333-222-1111");
        Class c = Class.forName("com.jdpattern.Kproxy.refl.Account");

        //Public Method
        Method ms[] = c.getDeclaredMethods();

        //Private Method
        Field[] fs = c.getFields();

        for (Method m : ms) {
            System.out.println(m.toString());
        }

        for (Field f : fs) {
            System.out.println(f.getName());
        }

        //Abstract Class
        Class superClass = c.getSuperclass();
        System.out.println(superClass.getName());


    }

    public void FlyableProxy() throws Exception {
        Flyable chickenBudy = new Chicken();
        System.out.println("----------- Control Adult ------------");
        Flyable chickenBudyAdultProxy = getAdultProxy(chickenBudy);
        chickenBudyAdultProxy.setFlyingSpeed(100);
        chickenBudyAdultProxy.Fly();


        System.out.println("----------- Control Children ------------");
        Flyable chickenBudyChildrenProxy = getChildrenProxy(chickenBudy);
        chickenBudyChildrenProxy.setFlyingSpeed(10);
        System.out.println(chickenBudyChildrenProxy.getFlayingSpeed());
        chickenBudyChildrenProxy.Fly();


        System.out.println("----------- Nested Adult,Children Effect ------------");
        chickenBudy = getAdultProxy(chickenBudy);
        chickenBudy.setFlyingSpeed(100);
        chickenBudy.Fly();
        chickenBudy = getChildrenProxy(chickenBudy);
        chickenBudy.setFlyingSpeed(10);
        System.out.println(chickenBudy.getFlayingSpeed());
        chickenBudy.Fly();
    }

    Flyable getAdultProxy(Flyable flyable) {
        return (Flyable) Proxy.newProxyInstance(flyable.getClass().getClassLoader(), flyable.getClass().getInterfaces(), new AdultInvocationHandler(flyable));
    }

    Flyable getChildrenProxy(Flyable flyable) {
        return (Flyable) Proxy.newProxyInstance(flyable.getClass().getClassLoader(), flyable.getClass().getInterfaces(), new ChildrenInvocationHandler(flyable));
    }


}
