package Poly;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Labrador("Lola", 2);
        Dog dog2 = new Labrador();
        Dog dog3 = new Labrador("Dorel");
        dog1.bark();
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
