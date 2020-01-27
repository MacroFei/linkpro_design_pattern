package com.xlccc.design.pattern.structural.decorator.v2;

public abstract class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    protected abstract void doSomething();
    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    protected int cost() {
        return this.aBattercake.cost();
    }
}
