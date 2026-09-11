// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] nums = {2,7,9,11,89,43};
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondlargest = largest;
                largest = nums[i];
            }
            else if(nums[i]>secondlargest && nums[i]!=largest){
                secondlargest=nums[i];
            }
        }
        System.out.println(largest+" " +secondlargest);
    }
}
