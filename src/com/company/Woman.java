package com.company;

import java.util.Random;
import java.util.Scanner;

public class Woman extends Human {
    public Woman(String name, String lastName, float height, float weight) {
        super(false, name, lastName, height, weight);
    }

    public Human babyBorn(Man man) {
        Human baby = null;
        boolean canBeBorn = Math.random() * 11 < 5;

        if (canBeBorn) {
            Scanner input = new Scanner(System.in);
            boolean sex = Math.random() * 11 < 5;
            if (sex) {
                System.out.println("It's incredible! They have a boy!!! What is his name?");
                String name = input.next();
                String lastName = man.getLastName();
                float height = man.getHeight() + 0.1f * (getHeight() - man.getHeight());
                float weight = man.getWeight() + 0.1f * (getWeight() - man.getWeight());
                baby = new Man(name, lastName, height, weight);
            } else {
                System.out.println("It's incredible! They have a girl!!! What is her name?");
                String name = input.next();
                String lastName = man.getLastName();
                float height = getHeight() + 0.1f * (man.getHeight() - getHeight());
                float weight = getWeight() + 0.1f * (man.getWeight() - getWeight());
                baby = new Woman(name, lastName, height, weight);
            }
        }
        return baby;
    }

    @Override
    boolean tolerance(Human human) {
        boolean methodOutput = false;
        if (human.getClass() == getClass()) {
            //  methodOutput = Math.random() * 11 < 0.5;
            methodOutput = true;
        } else if (human.getClass() == Man.class) {
            // methodOutput = Math.random() * 11 < 3;
            methodOutput = true;
        }
        return methodOutput;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "Name: '" + getName() + '\'' +
                ", Last name: '" + getLastName() + '\'' +
                ", Height: " + String.format("%.2f", getHeight()) +
                ", Weight: " + String.format("%.2f", getWeight()) +
                '}';
    }
}
