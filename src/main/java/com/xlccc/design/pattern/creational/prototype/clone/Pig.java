package com.xlccc.design.pattern.creational.prototype.clone;

import java.util.Date;

public class Pig implements Cloneable {
    private String name ;
    private Date bitrhday;

    public Pig(String name, Date bitrhday) {
        this.name = name;
        this.bitrhday = bitrhday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBitrhday() {
        return bitrhday;
    }

    public void setBitrhday(Date bitrhday) {
        this.bitrhday = bitrhday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Pig pig = (Pig) super.clone();
        //深克隆
        pig.bitrhday = (Date) pig.bitrhday.clone();
        return pig;
    }


    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", bitrhday=" + bitrhday +
                '}'+super.toString();
    }
}
