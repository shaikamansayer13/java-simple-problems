import java.util.*;

public class Main
{
    public static int pow(int x,int y){
        if(x==0){
            return 1;
        }
        if(y==0){
            return 1;
        }
     int ans = pow(x,y-1)*x;
     return ans;
    }
	 public static void main(String[] args) {
	    int power =  pow(2,5);
	    System.out.println(power);
	}
}
