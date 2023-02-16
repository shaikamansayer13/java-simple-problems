import java.util.*;

public class Main
{
    public static void fibbo(int a,int b,int n){
        if(n==0){
            return ;
    }
     int c=a+b;
     System.out.print(c+" ");
     fibbo(b,c,n-1);
    }
	 public static void main(String[] args) {
	     int a=0,b=1;
	     System.out.print(a+ " ");
	     System.out.print(b+ " ");
		fibbo(0,1,6);
	}
}
