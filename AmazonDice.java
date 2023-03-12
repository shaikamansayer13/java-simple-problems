import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println(dice("",4,6));
     System.out.println(dice("",4,6).size());
}
    public static ArrayList<String> dice(String str,int target,int face){
        if(target == 0){
            ArrayList<String> list =  new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1;i<= face && i<=target;i++){
            ans.addAll(dice(str + i,target - i,face));
        }
        return ans;
    }
}
// we can do it without using the return type also 

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    dice("",4,6);
}
    public static void dice(String str,int target,int face){
        if(target == 0){
        System.out.println(str);
        }
        for(int i = 1;i<= face && i<=target;i++){
            dice(str + i,target - i,face);
        }
    }
}
