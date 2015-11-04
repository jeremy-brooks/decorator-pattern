package com.decorator;

/**
 * Created by jbrooks on 04/11/2015.
 */
public class Espresso extends Beverage {

    public Espresso(){
        this.setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.50;
    }
}
