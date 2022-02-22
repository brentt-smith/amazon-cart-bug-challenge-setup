package org.example;

public interface Promotion {
    long getItemId();
    double getDiscount(); //from 0.0 to 1.0. I.e, .2 means the discount is 20%
    String getDescription();
}
