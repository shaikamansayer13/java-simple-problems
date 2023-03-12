//Permutations question
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str = "abc";
    ArrayList<String> n = p(str,"");
    System.out.print(n);
}
    public static ArrayList<String>  p(String str , String newstr){
      if(str.isEmpty()){
         ArrayList<String> list = new ArrayList<>();
         list.add(newstr);
         return list;
      }
      char ch = str.charAt(0);
      ArrayList<String> ans = new ArrayList<>();
      for(int i = 0 ;i<=newstr.length();i++){
          String first = newstr.substring(0,i);
          String second = newstr.substring(i,newstr.length());
          ans.addAll(p(str.substring(1),first + ch + second));
      }
      return ans;
    }
    
}
//lets do it without arraylist as return type
//Permutations question
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str = "abc";
    p(str,"");
}
    public static void  p(String str , String newstr){
      if(str.isEmpty()){
        System.out.print(newstr);
        return;
      }
      char ch = str.charAt(0);
      
      for(int i = 0 ;i<=newstr.length();i++){
          String first = newstr.substring(0,i);
          String second = newstr.substring(i,newstr.length());
          p(str.substring(1),first + ch + second);
      }
    }
}

//now lets count the number of permutations 

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str = "abcd";
    System.out.print(p(str,""));
}
    public static int p(String str , String newstr){
      if(str.isEmpty()){
        return 1;
      }
      char ch = str.charAt(0);
      int count = 0;
      for(int i = 0 ;i<=newstr.length();i++){
          String first = newstr.substring(0,i);
          String second = newstr.substring(i,newstr.length());
         count = count + p(str.substring(1),first + ch + second);
      }
      return count;
    }
}
