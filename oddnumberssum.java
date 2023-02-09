import java.util.*;
public class Main
{
  public static int addition(int b){
     int sum = 0;
      for(int i =1;i<=b;i++ ){
        if(i%2!=0){
        sum=sum+i;
        }
      }
      return sum;
}
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    System.out.println("sum of 1 to n odd numbers is " + addition(b));
 }
}
