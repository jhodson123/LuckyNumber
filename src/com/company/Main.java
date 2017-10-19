package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LuckyNumber lucky = new LuckyNumber();

        boolean running = true;

        while(running) {

            System.out.println("Enter 0 to exit, 1 to list names, or 2 to add a name: ");
            int in = input.nextInt();

            if (in == 0) {

                running = false;
            } else if (in == 1) {

                    for (int i = 0; i < lucky.numOfElements; i++) {

                        System.out.println(lucky.names[i]);
                        System.out.println(lucky.nums[i]);
                    }
            } else {

                System.out.println("Enter your name: ");
                String fdsafa = input.nextLine();
                String name = input.nextLine();

                lucky.generate(name);
            }
        }
    }
}
