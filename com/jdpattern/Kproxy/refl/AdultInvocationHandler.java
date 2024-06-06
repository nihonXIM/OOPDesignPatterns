package com.jdpattern.Kproxy.refl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AdultInvocationHandler implements InvocationHandler {
    Flyable flyable;
    String id = "10";

    public AdultInvocationHandler(Flyable flyable) {
        this.flyable = flyable;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String appendix = "Adult Controlled-";
        if(method.getName().startsWith("Fly")){
            System.out.print(id+"-"+appendix);
        }
        return method.invoke(flyable, args);
    }
}
