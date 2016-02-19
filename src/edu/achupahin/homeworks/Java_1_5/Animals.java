package edu.achupahin.homeworks.Java_1_5;

import java.util.Date;

public abstract class Animals extends Life implements Eating {
    protected float length;
    protected char gender;
    protected int limbs;
    protected int tooths;

    public Animals(String name, Date birth, Date death, float weight, float height, float length, char gender, int limbs, int tooths) {
        super(name, birth, death, weight, height);
        this.length = length;
        this.gender = gender;
        this.limbs = limbs;
        this.tooths = tooths;
    }

    protected abstract String walk();

    public abstract String voice();

    @Override
    public String eat(String food) {
        return "i like " + food;
    }

}

