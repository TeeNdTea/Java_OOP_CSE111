public class Shape2D {
     double l;
     double b;
     double h;
     double s1, s2, s3;
     String shapeType;
    public Shape2D(double l) {
        this.l = l;
        this.shapeType = "Square";
        System.out.println("A Square has been created with length: " + l);
    }
    public Shape2D(double l, double b) {
        this.l = l;
        this.b = b;
        this.shapeType = "Rectangle";
        System.out.println("A Rectangle has been created with length: " + l + " and breadth: " + b);
    }
    public Shape2D(double h, double base, String shapeType) {
        if (shapeType.equals("Triangle")) {
            this.h = h;
            this.b = base;
            this.shapeType = "Triangle";
            System.out.println("A Triangle has been created with height: " + h + " and base: " + base);
        }
    }
    public Shape2D(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.shapeType = "Triangle";
        System.out.println("A Triangle has been created with the following sides: " + s1 + ", " + s2 + ", " + s3);
    }
    public void area() {
        if (shapeType.equals("Square")) {
            double area = l * l;
            System.out.println("The area of the Square is: " + area);
        } 
        else if (shapeType.equals("Rectangle")) {
            double area = l * b;
            System.out.println("The area of the Rectangle is: " + area);
        } 
        else if (shapeType.equals("Triangle") && h != 0 && b != 0) {
            double area = 0.5 * h * b;
            System.out.println("The area of the Triangle is: " + area);
        } 
        else if (shapeType.equals("Triangle") && s1 != 0 && s2 != 0 && s3 != 0) {
            double s = (s1 + s2 + s3) / 2;
            double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
            System.out.println("The area of the Triangle is: " + area);
        }
    }
}
