import java.util.*;


public class Main
{
  public static void main (String args[])
  {

    int n = 5;			//0101 //Update bit in java
    int pos = 1;
    int bitMask = 1 << pos;
    Scanner sc = new Scanner(System.in);
    int operator = sc.nextInt();
    int notbitmask = ~(bitMask);
    if (operator == 1)
      {
	int newbitmask = (bitMask | n);
	  System.out.println (newbitmask);
      }
    else
      {
	int newbitmask = (notbitmask & n);
	System.out.println (newbitmask);
      }

  }
}
