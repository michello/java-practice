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
