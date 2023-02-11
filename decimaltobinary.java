				    //Decimal to Binary (10)~~(1010).
import java.util.*;


public class Main
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    int dec = sc.nextInt ();
    int bin [] = new int [10];
    int i=0;
    while(dec>=1)
    {
        bin[i]=dec%2;
        i++;
        dec=dec/2;
    }
    System.out.println("The binary number is");
    for(int j=i-1;j>=0;j--){
    System.out.print(bin[j]);
  }
 }
}
