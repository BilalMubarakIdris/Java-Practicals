package circle;
public class Circle {
    static double PI = 3.14159;
    public static void main(String[] args){ 
        int radius;
        double area;
        radius = Integer.parseInt(args[0]);
        //area formula
        area = PI * (radius * radius);
        System.out.println("A Circle of radius " + args[0] + " has area of " + area);
    }
}
