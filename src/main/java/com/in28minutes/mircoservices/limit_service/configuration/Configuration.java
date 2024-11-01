package com.in28minutes.mircoservices.limit_service.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@org.springframework.context.annotation.Configuration
@ConfigurationProperties("limits-service")
public class Configuration {
    private static int minimum;
    private static int maximum;

    public static int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public static int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
