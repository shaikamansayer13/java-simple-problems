import java.util.*;
public class Main
{
  public static void main (String args[])
  {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
    int array[] = new int [size];
    //input
    for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
    }
    //reverse of array
    for(int i=size-1;i>=0;i--){
        System.out.print(array[i] + " ");
    }
    }
}
