import java.util.HashSet;
public class Main
{
  public static String keypad[] =
    { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
    "tu", "vwx", "yz"
  };
  public static void printKeypadCombination (String number, int idx,
					     String res)
  {
    if (idx == number.length ())
      {
	System.out.println (res);
	return;
      }
    char currchar = number.charAt (idx);
    String mapping = keypad[currchar - '0'];
    for (int i = 0; i < mapping.length(); i++)
      {
	printKeypadCombination (number, idx + 1, res + mapping.charAt(i));
      }
  }
  public static void main (String args[])
  {
    String number = "23";
    printKeypadCombination (number, 0, "");
  }
}
