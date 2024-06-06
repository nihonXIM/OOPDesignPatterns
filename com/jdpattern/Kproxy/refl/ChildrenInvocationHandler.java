package com.jdpattern.Kproxy.refl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ChildrenInvocationHandler implements InvocationHandler {

    Flyable flyable;
    String id = "5";

    public ChildrenInvocationHandler(Flyable flyable) {
        this.flyable = flyable;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("set")){
            System.out.println("Permission is not allowed!");
            return null;
        }
        return method.invoke(flyable, args);
    }
}
