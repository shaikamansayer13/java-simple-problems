import java.util.*;


public class Main
{
  public static void main (String args[])
  {
    StringBuilder sb = new StringBuilder ("apnaCollegeJava@gmail.com");
      System.out.println (sb);
    //output without @
    for (int i = 0; i < sb.length (); i++)
      {
	if (sb.charAt (i) == '@')
	  {
	    sb.delete (i, sb.length ());
	  }
      }System.out.println(sb);
  }
}
