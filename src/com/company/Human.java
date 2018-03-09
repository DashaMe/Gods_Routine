package com.company;

public class Human {
    private boolean sex;
    private String name;
    private String lastName;
    private float height;
    private float weight;

    public Human(boolean sex, String name, String lastName, float height, float weight) {
        this.sex = sex;
        this.name = name;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    boolean talk(Human human) {
        return true;
    }

    boolean tolerance(Human human) {
        return true;
    }

    boolean together(Human human) {
        boolean methodOutput;
        if ((1 - (getHeight() / human.getHeight())) > 0.1) {
            methodOutput = Math.random() * 11 < 1.5;
        } else {
            methodOutput = Math.random() * 11 < 0.5;
        }
        return methodOutput;
    }

    boolean relationshipResult(Human human) {
        boolean relationships = false;
        boolean areTolerant = tolerance(human);
        boolean canTalk = talk(human);
        boolean canBeTogether = together(human);

        if (areTolerant && canTalk && canBeTogether && (getClass() != human.getClass())) {
            System.out.println("Yep! They can be together");
            relationships = true;
        }
        return relationships;
    }

    public static Human compatibilityTest(boolean relationships, Human human1, Human human2) {
        Human newHuman = null;
        if (relationships) {
            if (human1.getClass() == Man.class) {
                Woman woman = (Woman) human2;
                newHuman = woman.babyBorn((Man) human1);
            } else {
                Woman woman = (Woman) human1;
                newHuman = woman.babyBorn((Man) human2);
            }
        }
        return newHuman;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Sex: " + sex +
                ", Name: '" + name + '\'' +
                ", Last name: '" + lastName + '\'' +
                ", Height: " + height +
                ", Weight: " + weight +
                '}';
    }
}
