package com.decorator.extras;

import com.decorator.Beverage;
import com.decorator.Condiments;

/**
 * Created by jbrooks on 04/11/2015.
 */
public class Milk extends Condiments {

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        double a = beverage.getCost() + 0.10;
        return a;
    }
}
