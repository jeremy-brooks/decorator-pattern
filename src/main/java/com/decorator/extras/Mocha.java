package com.decorator.extras;

import com.decorator.Beverage;
import com.decorator.Condiments;

/**
 * Created by jbrooks on 04/11/2015.
 */
public class Mocha extends Condiments {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double getCost() {
        return 0.20 + beverage.getCost();
    }
}
