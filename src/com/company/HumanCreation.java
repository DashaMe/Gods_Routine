package com.company;

import java.util.Scanner;

public class HumanCreation {

    public static Human humanCreation() {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        System.out.println("Enter person's sex (male, female):");
        String sex = "";
        while (check) {
            sex = input.next();
            if (sex.equals("male")) {
                check = false;
            } else if (sex.equals("female")) {
                check = false;
            } else {
                System.out.println("Please, input correct value for the sex");
            }
        }

        System.out.println("Enter person's name:");
        String name = input.next();
        System.out.println("Enter person's last name:");
        String lastName = input.next();
        System.out.println("Enter person's height:");
        float height = (float) input.nextDouble();
        System.out.println("Enter person's weight:");
        float weight = (float) input.nextDouble();

        if (sex.equals("male")) {
            return new Man(name, lastName, height, weight);
        } else {
            return new Woman(name, lastName, height, weight);
        }


    }
}
