# Notes
## Section 1: Intro - What is Java and How It Works

<img src="./img/java_compilation_diagram.png">

1. You write in a `.java` file (text file)
2. `.java` will be turned into a binary format by `javac` (JDK)
    * `.java` file needs to be turned into a binary file that can be read by computer
3. You get a binary file for every file or class you create
4. You need to turn this binary file to a computer program
    * Java uses JRE and JVM
    * JRE: Java Runtime Environment
        * JRE sets up, creates, and runs JVM
    * JVM: Java Virtual Machine
        * JVM is a virtual machine or simulated computer
        * This enables any computer/machine to run your java file.
    * Binary File --> JRE --> JVM

.java --> .class file
1. Write code
2. Compile code `javac FILENAME.java`
3. Run code `java FILENAME`

# Types
* primitive types are denoted by lowercase letters
```Java
int value = 0;
```
* types denoted by uppercase letters are objects/reference to a place in memory
```Java
String text = null;
```

# Classes
* A class is an object
* A class can contain:
    1. methods
    2. properties, or data
        - aka instance variables, data or "state"

# Encapsulation
* the data you have in one class is hidden away from other classes
* make sure that "sensitive" data is hidden from users.
* To achieve this, you must:
    1. declare class variables/attributes as private
    2. provide public get and set methods to access and update the value of a private variable

# Constructor
* used to initialize the object
* called when an instance of the class is created

# Static Variables & Static functions
[Difference between static and instance variables](https://softwareengineering.stackexchange.com/a/293480)
* Class or Static variable/methods belong to the class
    - Only one copy of this variable that is shared with all instances of that class
    - If changes are made to that variable, all other instances will see the effect of the changes.
    - Static variables/methods exist before you make an instance
    - You can access static variables by the class

* Nonstatic, public variables are instance variables
* Uses for static variable
    1. When info is associated with the class and doesn't need to be changed
    1. When you want a const (`final`)
        - i.e. public final static int LUCKY_NUMBER = 7;
    1. Create a counter of how many instances of the class there is
        - A static variable is shared between all objects

# String Builder and String Formatting
* In Java, strings are immutable
```Java
String info = "";
info += "My name is Bob.";
info += " ";
info += "I am a builder.";
```
* You are creating a new string every time you are adding to the string

# packages
1. Enable you to organize code in an organized fashion
2. Allow you to have classes of the same name in different packages

[Java Packages](https://www.tutorialspoint.com/java/java_packages.htm)
* When compiling programs in a package, compile with the following:
```
javac -d Destination_folder file_name.java
```

Example:
```
% javac -d . src/Machine.java
% javac -d . src/Car.java    
% javac -d . src/App.java
```

# Interface
* A structure that contains implementable functions
* Contains behaviors that a class implements.
* Uses
    - Only care about the methods (i.e. List interface)

# private, public, protected methods
* public can be accessed anywhere
* private can only be accessed where it is declared
* protected allows you to access the variable within the package, subclass, etc

* private: same class
* public: any
* protected: same subclass, same package
* no modifier: same package only

# Polymorphism
[W3 School's Java - Polymorphism](https://www.w3schools.com/java/java_polymorphism.asp)
* polymorphism: "many shapes"
* Inheritance lets us take on attributes and methods from inherited or parent class
* Polymorphism lets us use these methods to perform different tasks
```Java
class Animal {
    public void speak() {
        System.out.println("Grr...");
    }
}

class Penguin extends Animal {
    public void speak() {
        System.out.println("Squeak, squeak...");
    }
}
```
* This allows us to perform a single action in different ways.