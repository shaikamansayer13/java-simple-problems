
import java.util.*;
public class Main
{
  public static void main (String args[])
  {
    String reverse = "";
    Scanner sc = new Scanner (System.in);

    String str = sc.nextLine ();

    //input
    for (int i = 0; i < str.length (); i++)
      {
	str.charAt (i);
      }
//reverse output
  System.out.println(str.length());
    for (int i = str.length () - 1; i >= 0; i--)
      {
        reverse += str.charAt(i);
	
      }
      System.out.println(reverse);
    if(str.compareTo(reverse)==0) {
     
          System.out.println("palindrome hain apan");
      }
      else{
          System.out.print ("chalaja bsdk");
      }
  }
}
