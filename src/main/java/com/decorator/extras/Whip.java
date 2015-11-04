package com.decorator.extras;

import com.decorator.Beverage;
import com.decorator.Condiments;

/**
 * Created by jbrooks on 04/11/2015.
 */
public class Whip extends Condiments {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.50;
    }
}
