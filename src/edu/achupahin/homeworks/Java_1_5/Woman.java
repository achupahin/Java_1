package edu.achupahin.homeworks.Java_1_5;

import java.util.Date;

public class Woman extends Human{
    protected boolean pregnant;

    public Woman(String name, Date birth, Date death, float weight, float height, String givenName, boolean pregnant) {
        super(name, birth, death, weight, height, givenName);
        this.pregnant = pregnant;
    }

    @Override
    protected String walk() {
        return "i like walk";
    }

    @Override
    public String voice() {
        return "i am woman";
    }
}
