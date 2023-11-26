// 1
public class Main {
    public static void main(String[] args) {
        // Static method
        DogStaticMethod.makeNoise();

        // Non-static method
        DogNonStaticMethod dogOne = new DogNonStaticMethod();
        dogOne.weightInKg = 5;
        dogOne.makeNoise();

        DogNonStaticMethod dogTwo = new DogNonStaticMethod();
        dogTwo.weightInKg = 55;
        dogTwo.makeNoise();
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
 */