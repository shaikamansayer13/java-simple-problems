import java.util.*;
public class Main
{
  public static void main (String args[])
  {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
    //input
    for(int i=0;i<str.length();i++){
        str.charAt(i);
    }
//reverse output
    for(int i=str.length()-1;i>=0;i--){
        System.out.print( str.charAt(i) );
    }
    }
}
