// 1
public class Main {
    public static void main(String[] args) {
        char c = 'H';
        int i = c;
        System.out.println(c);;
        System.out.println(i); // 72 (ASCII value of H)

        System.out.println("\nReference type:");
        Walrus a = new Walrus(1000, 8.3);
        Walrus b;
        b = a;
        b.weight = 500;
        System.out.println(a);
        System.out.println(b);

        System.out.println("\nPrimitive type:");
        int x = 5;
        int y;
        y = x;
        x = 2;
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
    }
}

/*
Notes:
1. Will the change to b affect a?
    YES, because they are pointing (or referring) to the same instance or address.

2. Will the change x affect y?
    NO, because x and y are two different variables. These variables are primitive types.
    The following are primitive types in Java: boolean, byte, short, char, int, long, float and double
 */