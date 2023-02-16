public class Main {
 public static void shiftExToEnd(StringBuilder str, int i){
        if(i==str.length()-1){
            System.out.print(str);
            return;
        }
        if(str.charAt(i)=='x'){
            str.delete(i, i+1);
            str.append("x");
        }
        shiftExToEnd(str, i+1);
    }
public static void main(String [] args){
    StringBuilder str = new StringBuilder("abxvxvxx");
    shiftExToEnd(str, 0);
}
}
