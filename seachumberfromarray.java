import java.util.*;


public class Main
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    int size = sc.nextInt ();
    int numbers[] = new int[size];


    //input
    for (int i = 0; i < size; i++)
      {
	numbers[i] = sc.nextInt ();
      }
// search 
    int x = sc.nextInt ();
    for (int i = 0; i < numbers.length; i++)
      {
	if (numbers[i] == x)
	  {
	    System.out.println ("the number found at: " + i);
	  }
      }
  }
}
