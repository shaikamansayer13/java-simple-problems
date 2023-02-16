import java.util.*;
public class Main
{
  public static void Printsum (int i,int n, int sum)
  {
      System.out.println(i);
    //base case
    if (i==n)
      {
        sum=sum+i;
        System.out.println(sum);
        return;
      }
    //work kya karra.
     sum = sum + i;
     Printsum(i+1,n,sum);
    
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    Printsum (0,5,0);
  }
}
