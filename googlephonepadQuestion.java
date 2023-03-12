import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str = "12";
    phonepad(str,"");
}
    public static void phonepad(String str , String newstr){
      if(str.isEmpty()){
        //when we reach the end of the recursion tree in the other words when our str is empty we are printing our new str.
          System.out.println(newstr);
        return ;
      }
      int digit = str.charAt(0) - '0'; //this is converting  the string "1" to integer 1.
      for(int i = (digit*3)-3 ;i<(digit*3);i++){ // the reason iam using for loop is I want to take a,b,c if I press 1 in the phone pad .
          char chh = (char) ('a' + i);  // we have to take a ,b and c .it will not take more alphabets because of for loop condition.
       phonepad(str.substring(1),chh + newstr); // recursive function we are removing the starting char from the str , we are adding our chh to the new str.
      }
    }
}
//now lets see the question was like return the permutations of phone pad in the list
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str = "26";
    System.out.print(phonepad(str,""));
    
}
    public static ArrayList<String> phonepad(String str , String newstr){
      if(str.isEmpty()){
      ArrayList<String> list = new ArrayList<>();
      list.add(newstr);
        return list;
      }
      int digit = str.charAt(0) - '0';
      ArrayList<String> ans = new ArrayList<>();
      for(int i = (digit*3)-3 ;i< digit*3;i++){
          char ch = (char) ('a' + i);
          ans.addAll(phonepad(str.substring(1),ch+newstr));
      }
      return ans;
    }
}

//lets say we need to count the number of permutations 
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str = "12";
    System.out.println(phonepad(str,""));
}
    public static int phonepad(String str , String newstr){
      if(str.isEmpty()){
        //when we reach the end of the recursion tree in the other words when our str is empty we are printing our new str.
        return 1;
      }
      int count = 0;
      int digit = str.charAt(0) - '0'; //this is converting  the string "1" to integer 1.
      for(int i = (digit*3)-3 ;i<(digit*3);i++){ // the reason iam using for loop is I want to take a,b,c if I press 1 in the phone pad .
          char chh = (char) ('a' + i);  // we have to take a ,b and c .it will not take more alphabets because of for loop condition.
       count = count + phonepad(str.substring(1),chh + newstr); // recursive function we are removing the starting char from the str , we are adding our chh to the new str.
      }
      return count;
    }
}
