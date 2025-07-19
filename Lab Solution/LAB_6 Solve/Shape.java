public class Shape {
    public String shapeName;
    public double area;

    public void setParameters(String name, double param1) {
        shapeName = name;

        if (name.equals("Circle")) {
            area = 3.1415 * param1 * param1;
        }
    }

    public void setParameters(String name, double param1, double param2) {
        shapeName = name;

        if (name.equals("Triangle")) {
            area = 0.5 * param1 * param2;
        }
    }

    public void setParameters(String name, double param1, double param2, double param3) {
        shapeName = name;

        if (name.equals("Trapezium")) {
            area = 0.5 * (param1 + param2) * param3;
        }
    }

    public String details() {
        return "Shape Name: " + shapeName + "\nArea: " + String.format("%.2f", area);
    }
}
