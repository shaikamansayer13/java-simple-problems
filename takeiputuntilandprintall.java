
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int positive =0;
        int negative = 0;
        int zeros =0;
        int input;
do{  int num = sc.nextInt();
    if(num>0){
        positive++;
    } System.out.println(positive);
    if(num<0){
        negative++;
    }System.out.println(negative);
    if(num==0){
        zeros++;
    }System.out.println(zeros);
    input = sc.nextInt();
    }while(input==1);
    
 }
}
