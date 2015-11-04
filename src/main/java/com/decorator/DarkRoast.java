package com.decorator;

/**
 * Created by jbrooks on 04/11/2015.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        this.setDescription("Dark Roast");
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
