// Chocolate Distribution Problem (Easy)

import java.util.*;
public class Question5 {
    public static void main(String args[]){
        int ans = Integer.MAX_VALUE;
        int arr[]={3, 4, 1, 9, 56, 7,9,12};

        Arrays.sort(arr);

        int max,min,gap;
        int m=5;

        for(int i=0; i<arr.length-m; i++){
            min = arr[i];
            max= arr[i+m-1];
            gap = max-min;
            if(gap<ans){
                ans=gap;
            }
        }
        System.out.println(ans);
    }
}
