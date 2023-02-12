import java.util.*;


public class Main{
    
   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 67};
   

     System.out.println("The sorted array is ");
       //selection sort
       for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
           for(int j=i+1; j<arr.length; j++) {
               if(arr[smallest]>arr[j]) {
                   smallest = j;
               } 
           }
                   //swap
                   int temp = arr[smallest];
                   arr[smallest] = arr[i];
                   arr[i] = temp;
       }
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
   }
   }
}
