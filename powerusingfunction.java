
import java.util.*;

public class Main{
    public static double pow(double a ,double b){
    return Math.pow(a,b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextLong();
        double b = sc.nextLong(); 
        System.out.println(Math.pow(a,b));
    }
}
