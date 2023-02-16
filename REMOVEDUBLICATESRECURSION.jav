public class Main {

public static String removeDuplicates(String str, int idx,String newstr, boolean present[]) {
if(idx == str.length()) {
return newstr;
}
char curr = str.charAt(idx);
if(present[curr-'a']) {
 return removeDuplicates(str, idx+1,newstr, present);
} else {
    newstr+=curr;
    present[curr-'a'] = true;
 return removeDuplicates(str, idx+1,newstr, present);
}
}
public static void main(String args[]) {
String str = "abcadbcefghabi";
boolean present[] = new boolean[str.length()];
System.out.println(removeDuplicates(str, 0,"", present));
}
}
