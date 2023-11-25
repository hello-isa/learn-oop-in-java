public class HelloNumbers {
    public static void main(String[] args){
        int n = 0;
        int m = 0;

        while (n < 10){
            System.out.println(m);
            n++;
            m = m + n;
        }
    }
}

/*
Notes:
1. Java is a statically-typed language (just like C).
    Variable types are known at compile type which means easier to debug and less error during run time.
 */