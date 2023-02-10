import java.util.*;


public class Main
{
  public static int fib (int n)
  {
    //base case
    if (n <= 1)
      {
	return n;
      }
     //recursive case
    else
      {
	return fib (n - 1) + fib (n - 2);
      }
  }
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    System.out.println (fib (n));
  }
}
