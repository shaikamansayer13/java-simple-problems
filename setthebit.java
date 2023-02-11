import java.util.*;


public class Main
{
  public static void main (String args[])
  {
    int n = 5;			//0101 //Set bit
    int pos = 1;
    int bitMask = 1 << pos;
    int newbitmask = (bitMask | n);
      System.out.println (newbitmask);

  }
}
