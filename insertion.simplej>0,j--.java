import java.util.*;
import java.util.Arrays;
public class Main{
    
    public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 67};

     System.out.println("The sorted array with insertion sort ");
       //insertion sort
       for(int i = 0; i<arr.length-1; i++){
          for(int j = i + 1; j>0 ; j--){
              if(arr[j]<arr[j - 1]){
                  int temp = arr[j];
                     arr[j] = arr[j - 1];
                     arr[j - 1] = temp;
              }
              else{
                  break;
              }
          }
       }
       System.out.print(Arrays.toString(arr));
    }
}
