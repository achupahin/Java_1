package edu.achupahin.homeworks.Java_1_5;

import java.util.Date;

public class Man extends Human{
    protected boolean hasBeard;

    public Man(String name, Date birth, Date death, float weight, float height, String givenName, boolean hasBeard) {
        super(name, birth, death, weight, height, givenName);
        this.hasBeard = hasBeard;
    }

    @Override
    protected String walk() {
        return "i like drive a car";
    }

    @Override
    public String voice() {
        return "i am a Man";
    }
}
