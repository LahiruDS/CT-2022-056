package q4;

import java.util.Scanner;
import q4.Cat;
import q4.Dog;
import q4.Pet;

public class Q4 {

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

                System.out.print("Enter coat color: ");
                String color = input.next();

                cat.setCoatColor(color);

                pets[count] = cat;

            }

            else if (type == 'd' || type == 'D') {

                Dog dog = new Dog();

                dog.setName(name);

                System.out.print("Enter weight: ");
                double weight = input.nextDouble();

                dog.setWeight(weight);

                pets[count] = dog;

            }

            else {

                System.out.println("Invalid type!");
                continue;
            }

            count++;
        }

        System.out.println("\n========== Cats ==========");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Cat) {

                Cat c = (Cat) pets[i];

                System.out.println(
                        "Name : " + c.getName()
                                + " | Type : Cat"
                                + " | Coat Color : "
                                + c.getCoatColor());
            }
        }

        System.out.println("\n========== Dogs ==========");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Dog) {

                Dog d = (Dog) pets[i];

                System.out.println(
                        "Name : " + d.getName()
                                + " | Type : Dog"
                                + " | Weight : "
                                + d.getWeight());
            }
        }

        input.close();
    }
}
