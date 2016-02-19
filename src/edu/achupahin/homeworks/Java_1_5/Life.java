package edu.achupahin.homeworks.Java_1_5;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public abstract class Life {
    protected String name;
    protected Date birth;
    protected Date death;
    protected float weight;
    protected float height;

    public Life(String name, Date birth, Date death, float weight, float height) {
        this.name = name;
        this.birth = birth;
        this.death = death;
        this.weight = weight;
        this.height = height;
    }

}
