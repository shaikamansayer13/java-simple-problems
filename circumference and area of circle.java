import java.util.*;
public class Main
{
  public static double circumference(double b){
      double cir=2*3.14*b;
      return cir;
  }
  public static double Area(double b){
      double Area=3.14*b*b;
      return Area;
  }
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     double b = sc.nextFloat();
     System.out.println("The Circumference of the circle with radius b is"+circumference(b));
     System.out.println("The Area of the circle with radius b is"+Area(b));
     }
  }
