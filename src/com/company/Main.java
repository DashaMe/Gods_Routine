package com.company;

import java.util.Random;

import static com.company.HumanCreation.humanCreation;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, dear powerful guy, please start to Create, do not forget to choose wisely");
        System.out.println("Create the first person.");
        Human human1 = humanCreation();
        System.out.println("Create the second person.");
        Human human2 = humanCreation();
        System.out.println("Amazing! You have created two persons. And now we will know if they are compatible.\n");

        boolean relationships = human1.relationshipResult(human2);
        if (relationships) {
            Human newHuman = Human.compatibilityTest(relationships, human1, human2);
            if (newHuman == null) {
                System.out.println("But unfortunately only them two...No children for now");
            } else {
                System.out.println("Here is their baby");
                System.out.println(newHuman);
            }
        } else {
            System.out.println("Unfortunately, these two persons cannot be happy together. Please, ask them to continue their journey without regrets. Some day they will be truly happy!");
        }

    }
}
