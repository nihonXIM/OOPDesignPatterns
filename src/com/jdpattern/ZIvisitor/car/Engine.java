package com.jdpattern.ZIvisitor.car;

public class Engine implements ICarElement {
    public void accept(ICarElementVisitor visitor) {
        visitor.visit(this);
    }

}

