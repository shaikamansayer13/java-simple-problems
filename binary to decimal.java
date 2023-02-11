				    // Binary to Decimal ( 1010 )~~~(10)
import java.util.*;


public class Main
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    int bin = sc.nextInt ();
    int dec = 0;
    int i = 1;
    int rem = 0;
    while (bin != 0)
      {
	rem = bin % 10;
	dec = dec + rem * i;
	bin = bin / 10;
	i = i * 2;
      }
    System.out.println (dec);
  }

}
