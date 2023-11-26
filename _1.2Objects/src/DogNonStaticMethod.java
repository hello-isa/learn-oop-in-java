//3
public class DogNonStaticMethod {
    int weightInKg; // Instance variable or non-static variable

    public void makeNoise(){
        if (weightInKg < 10){
            System.out.println("Yip! Yip! Yip!");
        } else if (weightInKg < 30){
            System.out.println("Bark! Bark! Bark!");
        } else {
            System.out.println("Awooo! Awooo! Awooo!");
        }
    }
}
