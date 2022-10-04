// Search in rotated sorted array
import java.util.*;
public class Question6{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        int a[]= {4,5,6,7,8,9,10,1,2};
        int target=input.nextInt();
        int low=0;
        int high=a.length-1;
        

        while(low <= high){
            int mid = (low+high)/2;

            if(target==a[mid]){
                System.out.println(target);
            }

            else if(a[mid]>=a[low]){
                if(target>=a[low] && target<a[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(a[mid]<=a[high]){
                if(target>a[mid] && target<=a[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        System.out.println(target);
    }
}