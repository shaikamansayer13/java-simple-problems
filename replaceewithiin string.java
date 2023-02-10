import java.util.*;


public class Main
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    String str = sc.nextLine ();
    // input
    for (int i = 0; i < str.length(); i++)
      {
	str.charAt (i);
      }
    //output
    String result = "";
    for (int i = 0; i < str.length(); i++)
      {
	if (str.charAt(i) == 'e')
	  {
	    result += 'i';
	  }
	else
	  {
	    result += str.charAt(i);
	  }
      }
   System.out.println(result);
  }
}
