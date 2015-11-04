package com.decorator;

/**
 * Created by jbrooks on 04/11/2015.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        this.setDescription("House Blend");
    }

    @Override
    public double cost() {
        return 0;
    }
}
