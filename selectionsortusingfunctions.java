import java.util.*;
import java.util.Arrays;

public class Main{
    
   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 6};
     System.out.println("The sorted array with selection sort is ");
     sele(arr);
     System.out.println(Arrays.toString(arr));
}
public static void sele(int [] arr){
    for(int i = 0;i<arr.length-1;i++){
    int last = arr.length - 1 - i;
    int maxindex = max(arr,0,last);
    swap(arr,maxindex,last);
}
}
public static void swap(int [] arr,int f,int s){
    int temp = arr[f];
        arr[f]=arr[s];
        arr[s] = temp;
}
public static int max(int [] arr,int start,int last){
    int max = start;
    for(int i = start;i<=last;i++){
        if(arr[max] < arr[i]){
           max = i;
    }
}
