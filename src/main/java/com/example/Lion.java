package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private FelineBehavior felineBehavior;

    public Lion(String sex, FelineBehavior felineBehavior) throws Exception {
        this.felineBehavior = felineBehavior;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return felineBehavior.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felineBehavior.getFood("Хищник");
    }
}
