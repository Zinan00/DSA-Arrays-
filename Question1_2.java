// Find the maximum & minimum value in an array
// Pairing Method

import java.util.*;
public class Question1_2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        int max, min, i;

        // input array
        for(i=0; i<=arr.length-1; i++){
            arr[i]=input.nextInt();
        }

        if(n%2==0){
            if(arr[0]>arr[1]){
                max=arr[0];
                min=arr[1];
            }
            else{
                max=arr[1];
                min=arr[0];
            }
            i=2;
        }
        else{
            max=arr[0];
            min=arr[0];
            i=1;
        }

        while(i < n-1){
            if(arr[i]>arr[i+1]){
                if(arr[i]>max){
                    max=arr[i];
                }
                if(arr[i+1]<min){
                    min=arr[i+1];
                }
            }
            else if(arr[i+1]>arr[i]){
                if(arr[i+1]>max){
                    max=arr[i+1];
                }
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            i+=2;
        }
        System.out.println("MAX: "+max);
        System.out.println("MAX: "+min);
    }
}