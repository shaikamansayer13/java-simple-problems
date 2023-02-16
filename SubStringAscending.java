import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int n = sc.nextInt();
       String s = str.substring(0,n);
       String smallest = s;
       String largest = s;
       
       // loop
       for(int i=1;i<=str.length()-n;i++){
           s = str.substring(i,n+i);
          if(s.compareTo(smallest)<0){
              smallest = s;
          }
          if(s.compareTo(largest)>0){
              largest = s;
          }
       }
       System.out.println(smallest);
       System.out.println(largest);  
    }
}
