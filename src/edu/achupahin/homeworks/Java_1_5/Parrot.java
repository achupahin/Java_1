package edu.achupahin.homeworks.Java_1_5;

import java.util.Date;

public class Parrot extends Animals {
    protected float wingspan;
    protected boolean canFly;

    public Parrot(String name, Date birth, Date death, float weight, float height, float length, char gender, int limbs, int tooths, float wingspan, boolean canFly) {
        super(name, birth, death, weight, height, length, gender, limbs, tooths);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    @Override
    protected String walk() {
        return "i walk sooo slowly";
    }

    @Override
    public String voice() {
        return "parry-fool";
    }
}
