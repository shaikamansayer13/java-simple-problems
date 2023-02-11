import java.util.*;


public class Main
{
  public static void main (String args[])
  {
    int n = 5;			//0101 //Clear bit
    int pos = 0;
    int bitMask = 1 << pos;
    int notbitmask = ~(bitMask);
    int newbitmask = (notbitmask & n);
      System.out.println (newbitmask);

  }
}
