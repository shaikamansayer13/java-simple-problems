import java.io.*;
import java.util.*;

public class Main
{

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt ();
    int b = sc.nextInt ();
    int c = sc.nextInt ();
    int d = sc.nextInt ();
    int e = sc.nextInt ();
    int f = sc.nextInt ();
    int sum = a + b;
    int sum1 = a + b + c;
    int sum2 = a + b + c + d + e;
    int sum3 = a + b + c + d + e + f;
      System.out.println (a + "+" + b + "=" + sum);
      System.out.println (a + "+" + b + "+" + c + "=" + sum1);
      System.out.println (a + "+" + b + "+" + c + "+" + d + "+" + e + "=" + sum2);
      System.out.println (a + "+" + b + "+" + c + "+" + d + "+" + e + "+" + f + "=" + sum3);
  }
}
