public class DogNonStaticMethod {
    int weightInKg;

    public void makeNoise(){
        if (weightInKg < 10){
            System.out.println("Yip!");
        } else if (weightInKg < 30){
            System.out.println("Bark!");
        } else {
            System.out.println("Awooo!");
        }
    }
}
