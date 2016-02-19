package edu.achupahin.homeworks.Java_1_5;

import java.util.Date;

public class Cat extends Animals {
    protected int lives;

    public Cat(String name, Date birth, Date death, float weight, float height, float length, char gender, int limbs, int tooths, int lives) {
        super(name, birth, death, weight, height, length, gender, limbs, tooths);
        this.lives = lives;
    }

    @Override
    protected String walk() {
        return "i can walk quietly";
    }

    @Override
    public String voice() {
        return "i am woman";
    }


}
