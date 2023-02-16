import java.util.*;
public class Main
{
  public static void Printnum (int n)
  {
    //base case
    if (n == 0)
      {
	return;
      }
    //work kya karra
    System.out.println (n);
    Printnum (n - 1);
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    Printnum (n);
  }
}
