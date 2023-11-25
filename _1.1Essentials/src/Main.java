public class Main {
    public static void main(String[] args) {
        System.out.print("Hello world!");
    }
}

/*
Notes:
1. All codes in Java must live in a class declared using the keywords `public class`.
    e.g. public class Main

2. The name of the class must match the file name.
    e.g. this file is Main.java and its class name is also Main

2. Java is a verbose language (compared to Python).

3. The code that is run in is inside a method (or a function) called `main` which is declared as `public static void main(String[] args)`.
    There could only be one main method just like C program.

4. In the terminal, run the following:
    javac Main.java
    java Main

    javac Main.java -> compiles (javac) the .java file and into .class file
    java Main -> interprets (java) the .class file

    Why make a class file?
    - No need to give out source file. Protects intellectual property.
    - Error-free and simpler for machine to execute because it is already compiled.
 */