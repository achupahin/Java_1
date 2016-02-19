package edu.achupahin.homeworks.Java_1_5;

import java.util.Date;


public class YearsOfLife {
    protected Date birth;
    protected Date death;

    public YearsOfLife(Date birth, Date death) {
        this.birth = birth;
        this.death = death;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getDeath() {
        return death;
    }

    public void setDeath(Date death) {
        this.death = death;
    }
}
