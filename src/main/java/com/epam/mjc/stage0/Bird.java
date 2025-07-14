package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        String fur = isHasFur() ? "a" : "no";
        String pawWordForm = getNumberOfPaws() == 1 ? "paw" : "paws";

        String baseDescription = "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " " + pawWordForm + " and " + fur + " fur.";
        String birdDescription = "Moreover, it has 2 wings and can fly.";
        return baseDescription + " " + birdDescription;
    }
}
