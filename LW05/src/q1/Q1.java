package q1;

public class Q1 {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setName("Rex");

        Cat cat = new Cat();

        cat.setName("Kitty");

        System.out.println("Dog Name : " + dog.getName());
        System.out.println("Dog Says : " + dog.speak());

        System.out.println();

        System.out.println("Cat Name : " + cat.getName());
        System.out.println("Cat Says : " + cat.speak());
    }
}