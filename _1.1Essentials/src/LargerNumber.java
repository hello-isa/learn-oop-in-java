// 3

// Returns the larger number between x and y
public class LargerNumber {
    public static int findLarger(int x, int y){
        if (x > y){
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args){
        System.out.println(findLarger(-5, 10));
    }
}

/*
Notes:
1. Functions in java must be declared and defined inside a class.
    A function that is part of a class is called method. Therefore, all functions are methods.
2. Just like in C, a function in Java has a return type and the parameters of function has a declared type.
    e.g.
    C: int findLarger(int x, int y)
    Java: public static int findLarger(int x, int y)
 */