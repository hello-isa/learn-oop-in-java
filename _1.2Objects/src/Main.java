// 1
public class Main {
    public static void main(String[] args) {
        // Static method
        System.out.println("Static method:");
        DogStaticMethod.makeNoise();
        System.out.print("\n");

        // Non-static method
        System.out.println("Non-static method:");
        DogNonStaticMethod dogOne; // Declaration
        dogOne = new DogNonStaticMethod(); // Assignment and instantiation
        dogOne.weightInKg = 5;
        dogOne.makeNoise(); // Invocation

        DogNonStaticMethod dogTwo = new DogNonStaticMethod(); // Declaration, assignment and instantiation
        dogTwo.weightInKg = 55;
        dogTwo.makeNoise();
        System.out.print("\n");

        // Constructor
        System.out.println("Constructor:");
        DogConstructor dogThree = new DogConstructor(20);
        dogThree.makeNoise();
        System.out.print("\n");

        // Array of objects
        System.out.println("Array of objects:");
        // `DogConstructor[] dogArray` and `DogConstructor dogArray[]` works the same
        DogConstructor[] dogArray = new DogConstructor[3]; // 3 is the size of the array
        dogArray[0] = new DogConstructor(25);
        dogArray[1] = new DogConstructor(4);
        dogArray[2] = new DogConstructor(38);
        int n;
        for (n = 0; n < 3; n++){
            dogArray[n].makeNoise();
        }
    }
}

/*
Notes:
1. DogStaticMethod.makeNoise();
    You are basically telling Java to find the `DogStaticMethod` class and the `makeNoise()` method.

2. A class that uses another class is sometimes called a "client" of that class.
    e.g. Main class is a client of DogStaticMethod class

3. An object is an instance of a class.
    e.g. `d` is an object of the `DogNonStaticMethod` class

4. Static method vs. Non-static method
    e.g. `DogStaticMethod` vs `DogNonStaticMethod`
    Check the methods for each class, the non-static method does not use the keyword `static`

5. Class that uses non-static methods can be instantiated multiple times.

6. Variables and methods of a class are called members of class.

7. Members of a class can be accessed using dot notation.

8. In object-oriented language, objects are typically constructed using a constructor.
    The instantiation is parameterized.

9. In array, you use the keyword `new` twice. Once to create an array that can hold 3 `DogConstructor` objects and twice ti create an actual DogConstructor object.
 */