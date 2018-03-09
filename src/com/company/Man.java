package com.company;

public class Man extends Human {
    public Man(String name, String lastName, float height, float weight) {
        super(true, name, lastName, height, weight);
    }

    @Override
    boolean talk(Human human) {
        boolean methodOutput = false;
        if (human.getClass() == getClass()) {
            methodOutput = Math.random() * 11 < 5;
        } else if (human.getClass() == Woman.class) {
            methodOutput = true;
        }
        return methodOutput;
    }

    @Override
    boolean tolerance(Human human) {
        boolean methodOutput = false;
        if (human.getClass() == getClass()) {
            methodOutput = Math.random() * 11 < 0.56;
        } else if (human.getClass() == Woman.class) {
            methodOutput = Math.random() * 11 > 3 ;
        }
        return methodOutput;
    }

    @Override
    public String toString() {
        return "Man{" +
                "Name: '" + getName() + '\'' +
                ", Last name: '" + getLastName() + '\'' +
                ", Height: " + String.format("%.2f", getHeight()) +
                ", Weight: " + String.format("%.2f", getWeight()) +
                '}';
    }
}
