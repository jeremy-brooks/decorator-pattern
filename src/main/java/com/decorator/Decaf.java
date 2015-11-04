package com.decorator;

/**
 * Created by jbrooks on 04/11/2015.
 */
public class Decaf extends Beverage {

    public Decaf(){
        this.setDescription("Decaf");
    }

    @Override
    public double cost() {
        return 2.10;
    }
}
