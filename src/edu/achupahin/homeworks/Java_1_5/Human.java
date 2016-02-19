package edu.achupahin.homeworks.Java_1_5;

import java.util.Date;

public abstract class Human extends Life implements Eating {
    protected String givenName;

    public Human(String name, Date birth, Date death, float weight, float height, String givenName) {
        super(name, birth, death, weight, height);
        this.givenName = givenName;
    }

    protected abstract String walk();

    public abstract String voice();

    @Override
    public String eat(String food) {
        return "i like " + food;
    }
}
