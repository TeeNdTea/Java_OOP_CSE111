public class Bird {
    public String name;
    public int altitude=0;

    public void makeNoise() {
        if (name == "Parrot") {
            System.out.println("Squawk");
        } else if (name == "Eagle") {
            System.out.println("Squee");
        }
    }

    // Method to fly up
    public void flyUp(int feet) {
        altitude += feet;
        System.out.println(name + " has flown up " + feet + " feet.");
    }

    public void flyDown(int feet) {
        if (altitude - feet < 0) {
            System.out.println(name + " cannot fly down " + feet + " feet.");
        } 
        else {
            altitude -= feet;
            if (altitude == 0) {
                System.out.println(name + " has flown down " + feet + " feet and landed.");
            } else {
                System.out.println(name + " has flown down " + feet + " feet.");
            }
        }
    }
}
