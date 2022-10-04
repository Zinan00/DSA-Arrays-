// Find Maximum Subarray (Easy)
// Use kadane's algorithm

public class Question3 {
    public static void main(String args[]){

        int a [] = {5,-3,5};
        int currentsum = 0;
        int maxsum=0;

        for(int i=0; i<a.length; i++){
            currentsum = currentsum + a[i];
            if(maxsum<currentsum){
                maxsum = currentsum;
            }
            if(currentsum<0){
                currentsum=0;
            }
        }
        System.out.println(maxsum);
    }
}
