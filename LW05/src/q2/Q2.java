package q2;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[100];

        int count = 0;

        while (true) {

            System.out.print("Enter pet name (STOP to finish): ");
            String name = input.next();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter pet type (c for cat, d for dog): ");
            char type = input.next().charAt(0);

            if (type == 'c' || type == 'C') {

                Cat cat = new Cat();
                cat.setName(name);

                pets[count] = cat;

            } else if (type == 'd' || type == 'D') {

                Dog dog = new Dog();
                dog.setName(name);

                pets[count] = dog;

            } else {

                System.out.println("Invalid pet type!");
                continue;
            }

            count++;
        }

        System.out.println("\n------ Pet List ------");

        for (int i = 0; i < count; i++) {

            System.out.print("Name : "
                    + pets[i].getName());

            if (pets[i] instanceof Cat) {

                System.out.println(" | Type : Cat");

            } else if (pets[i] instanceof Dog) {

                System.out.println(" | Type : Dog");
            }
        }

        input.close();
    }
}