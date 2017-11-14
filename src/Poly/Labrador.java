package Poly;

public class Labrador extends Dog {
    public String name;
    public int age;

    public Labrador(String name, int age) {
        this.name = name;
        this.age = age;
//        System.err.println("In SUB CLASS constructor");
    }

    public Labrador(String name) {
        super(name); // you give the name, age will be default 999
        this.name = name;
        this.age = super.getAge();
    }

    public Labrador() {
        super(); // no age and no name initialized
    }

    public void bark() {
        System.out.println("Labrador barks");
    }

    @Override
    public String toString() {
        return "Labrador{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
