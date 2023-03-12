//sub sequence 
import java.util.*;
import java.util.HashSet;

public class Main
{
  public static void main (String[]args)
  {
    String str = "aaa";
      HashSet < String > set = new HashSet <> ();
      subseq (str, "", set);
  }
  public static void subseq (String str, String newstr,
			     HashSet < String > set)
  {
    if (str.isEmpty ())
      {
	if (set.contains (newstr))
	  {
	    return;
	  }
	else
	  {
	    set.add (newstr);
	    System.out.println (newstr);
	    return;
	  }
      }
    char ch = str.charAt (0);
    subseq (str.substring (1), newstr + ch, set);
    subseq (str.substring (1), newstr, set);
  }
}
