// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] nums = {2,7,9,11};
        int target = 9;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                System.out.print(map.get(complement)+" "+i);
            }
            map.put(nums[i],i);
        }
    }
}
