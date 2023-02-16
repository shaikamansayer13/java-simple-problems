import java.util.*;

public class Main
{
    public static void reverse(int index, String x){
        if(index==0){
            System.out.print(x.charAt(index));
            return;
        }
        System.out.print(x.charAt(index));
        reverse(index-1,x);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int index = x.length()-1;
        reverse(index,x);
    }
}
