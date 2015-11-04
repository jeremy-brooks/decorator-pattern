package com.decorator;

/**
 * Created by jbrooks on 04/11/2015.
 */
public abstract class Beverage {
    private String description = "none";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public abstract double getCost();
}
