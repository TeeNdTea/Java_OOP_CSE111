public class Parcel {
    String name;
    int weight;
    double totalFee;
    public Parcel() {
        this.weight = 0;
        this.totalFee = 0.0;
    }
    public Parcel(String name) {
        this.name = name;
        this.weight = 0;
        this.totalFee = 0.0;
    }
    public Parcel(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public void calcFee(String location) {
        int locationCharge = 0;
        if (location.equals("Dhanmondi")) {
            locationCharge = 50;
        }
        if (weight == 0) {
            totalFee = 0;
        } 
        else {
            totalFee = (weight * 20) + locationCharge;
        }
    }
    public void addWeight(int extra) {
        this.weight += extra;
        System.out.println("Updated Weight: " + this.weight);
    }
    public void printDetails() {
        if (name == null) {
            System.out.println("Set name first");
        } 
        else {
            System.out.println("Name: " + name);
            System.out.println("Total Weight: " + weight);
            System.out.println("Total Fee: " + totalFee);
        }
    }
}
