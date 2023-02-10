import java.util.*;


public class Main
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    int size = sc.nextInt ();
    int a = 0, b = 1;
      System.out.print (a + " " + b);
    int c;
    for (int i = 0; i <= size; i++)
      {
	c = a + b;
	System.out.print (" " + c);
	a = b;
	b = c;
      }
  }
}
