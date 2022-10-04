// Find the maximum & minimum value in an array
// Linear Search Method

import java.util.*;
public class Question1_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max, min;

        //input array
        for(int i=0; i<=arr.length-1; i++){
            arr[i]=sc.nextInt();
        }

        if(n==1){
            max=arr[0];
            min=arr[0];
        }
        if(arr[0]>arr[1]){
            max=arr[0];
            min=arr[1];
        }
        else{
            max=arr[1];
            min=arr[0];
        }

        for(int i=2; i<=arr.length-1; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("MAX: "+max);
        System.out.println("min: "+min);
    }
}