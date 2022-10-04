// Reverse an array or string
// Recursive method

import java.util.*;
public class Question2_1 {

    public static void reverse(int arr[], int start, int end){
        
        //Terminating condition
        if(start>=end){
            return;
        }

        //swaping logic

        int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        //recursive call
        reverse(arr, start+1, end-1);
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<=arr.length-1; i++){
            arr[i] = input.nextInt();
         }

         reverse(arr, 0, n-1);
         System.out.println("After reversing");

         for(int i=0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
         }
    }
}
