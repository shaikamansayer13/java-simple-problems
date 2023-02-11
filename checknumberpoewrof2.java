import java.util.*;


public class Main
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt ();
    
    int power=0;
    double value =0;
    while(num>value){
    
        value =Math.pow(2,power);
        power++;
   
    }
    //System.out.println(value + " crossing the limit ");
    if (value==num){
System.out.println("power of 2");
    }
    else{
        System.out.println("not power of 2");
    }
 }
}
