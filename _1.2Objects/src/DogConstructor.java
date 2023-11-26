// 4
public class DogConstructor {
    int weightInKg;

    // Constructor
    // The name of the constructor should match the name of the class
    public DogConstructor(int w){
        weightInKg = w;
    }

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
