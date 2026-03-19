package com.kauabiscotto.TransportSystem;

public class Driver {

    private String name;
    private String CNH;
    private int experience;


    public Driver(String name, String CNH, int experience) {
        this.name = name;
        this.CNH = CNH;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getCNH() {
        return CNH;
    }

    public int getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver [Nome: " + name +
                ", CNH: " + CNH +
                ", Experience: " + experience + " years]";
    }

}
