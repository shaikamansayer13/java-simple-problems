public class Main {
public static void printSubseq(String str, int idx, String res) {
if(idx == str.length()) {
System.out.println(res);
return;
}
//choose
printSubseq(str, idx+1, res+str.charAt(idx));
//don't choose
printSubseq(str, idx+1, res);
}
public static void main(String args[]) {
String str1 = "abc";
String str2 = "aaa";
printSubseq(str1, 0, "");
}
}
