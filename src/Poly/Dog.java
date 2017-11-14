package Poly;

public abstract class Dog {
    private String name;
    private int age;

    public Dog() {
//        System.err.println("In SUPERCLASS constructor");
    }

    public Dog(String name) {
        this.name = name;
        this.age = 999;
    }

    public void bark() {
        System.out.println("Dog barks");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
