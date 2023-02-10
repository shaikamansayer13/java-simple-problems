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
    for (int i = 0; i < numbers.length; i++)
      {
	for (int j = i + 1; j < numbers.length; j++)
	  {

	    if (numbers[i] < numbers[j])
	      {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	      }
	  }
      }
    for (int i = 0; i < numbers.length; i++)
      {
	System.out.print (numbers[i] + " ");
      }
  }
}
