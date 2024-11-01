package com.in28minutes.mircoservices.limit_service.controller;

public class Limits {

    private int maximum;
    private int minimum;

    public Limits(int maximum, int minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;

    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }

}
