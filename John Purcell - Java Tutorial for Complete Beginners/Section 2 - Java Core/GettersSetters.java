class APerson {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttributes(int age, String name) {
        setName(name);
        setAge(age);
    }
}

public class GettersSetters {
    public static void main(String[] args) {
        APerson michelle = new APerson();
        // michelle.setAge(23);
        // michelle.setName("Michelle");
        michelle.setAttributes(23, "Michelle");
        System.out.println(michelle.getName() + " is " + michelle.getAge() + " years old.");
    }
}
