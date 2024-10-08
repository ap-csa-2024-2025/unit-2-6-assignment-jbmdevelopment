import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    double radius = input.nextDouble();
    Circle c1 = new Circle(radius);
    double area = c1.getArea();
    double circumference = c1.getCircumference();
    System.out.println("A circle with a radius of " + radius + " has a circumference of " + circumference + " and an area of " + area);
    // write solutions to problems here
  }
}
