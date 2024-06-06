package com.retrain.jdpattern.ZIvisitor.car;

public class Body implements ICarElement{
    public void accept(ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}
