package q3;

import java.util.Scanner;

import java.util.Scanner;

public class Q3 {

    private static Object pets;

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

                Pet cat = new Pet();
                cat.setName(name);

                pets[count] = cat;

            } else if (type == 'd' || type == 'D') {

                Pet dog = new Pet();
                dog.setName(name);

                pets[count] = dog;

            } else {

                System.out.println("Invalid type!");
                continue;
            }

            count++;
        }

        // Print all cats first
        System.out.println("\n----- Cats -----");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Cat) {

                System.out.println(pets[i].getName());
            }
        }

        // Print all dogs
        System.out.println("\n----- Dogs -----");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Dog) {

                System.out.println(pets[i].getName());
            }
        }

        input.close();
    }

    public static Object getPets() {
        return pets;
    }

    public static void setPets(Object pets) {
        Q3.pets = pets;
    }
}