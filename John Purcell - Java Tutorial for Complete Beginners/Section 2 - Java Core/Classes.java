// everything is an object
class Person {
    // instance variables
    String name;
    int age;

    void speak() {
        System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
    }
}

public class Classes {
    public static void main(String[] args) {
        Person michelle = new Person();
        michelle.name = "Michelle";
        michelle.age = 24;

        michelle.speak();

        Person justin = new Person();
        System.out.println("This person's name is " + michelle.name + "and she is " + michelle.age + " years old.");
    }
}