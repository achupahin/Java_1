package edu.achupahin.homeworks.Java_1_5;

import java.util.Date;

public class Dog extends Animals {
    protected int speed;
    protected String skill;

    public Dog(String name, Date birth, Date death, float weight, float height, float length, char gender, int limbs, int tooths, int speed, String skill) {
        super(name, birth, death, weight, height, length, gender, limbs, tooths);
        this.speed = speed;
        this.skill = skill;
    }

    @Override
    protected String walk() {
        return "i can run";
    }

    @Override
    public String voice() {
        return "uf-uf";
    }
}
