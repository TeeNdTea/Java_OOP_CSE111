public class Test3 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double radius = circle.radius;
        System.out.println("Radius of the circle is " + radius);
        
        double pi = 3.1415;
        double area = pi * radius * radius;
        System.out.println("The area of the circle is " + area);
        
        double circumference = 2 * pi * radius;
        System.out.println("The circumference of the circle is " + circumference);
    }
}