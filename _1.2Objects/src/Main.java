// 1
public class Main {
    public static void main(String[] args) {
        DogStaticMethod.makeNoise();

        DogNonStaticMethod d = new DogNonStaticMethod();
        d.weightInKg = 5;
        d.makeNoise();
    }
}

/*
Notes:
1. DogStaticMethod.makeNoise();
    You are basically telling Java to find the `DogStaticMethod` class and the `makeNoise()` method.

2. A class that uses another class is sometimes called a "client" of that class.
    e.g. Main class is a client of DogStaticMethod class
 */