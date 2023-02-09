import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt ();
    int flag = 0;
    if (a == 0)
      {
	System.out.println ("Not Valid");
      }
    if (a == 1)
      {
	System.out.println ("Not Valid");
      }
    if (a > 2)
      {
	for (int i = 1; i <= a; i++)
	  {
	    if (a % i == 0)
	      {
		flag++;
	      }
	  }
	if (flag > 2)
	  {
	    System.out.println ("not a  prime");
	  }
	else
	  {
	    System.out.println (" prime");
	  }
      }


  }
}
