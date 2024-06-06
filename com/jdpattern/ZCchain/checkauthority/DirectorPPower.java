package com.retrain.jdpattern.ZCchain.checkauthority;

public class DirectorPPower extends PurchasePower{
    
    protected double getAllowable(){
        return BASE*20;
    }

    protected String getRole(){
        return "Director";
    }
}
