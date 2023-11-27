public class Walrus {
    int weight;
    double tuskSize;

    // Constructor
    public Walrus(int w, double ts){
        weight = w;
        tuskSize = ts;
    }

    public String toString(){
        return String.format("weight: %d, tusk size: %.2f", weight, tuskSize);
    }
}
