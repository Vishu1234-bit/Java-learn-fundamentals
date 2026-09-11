// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main{
    public static void main(String[] args){
        String s1 = "java";
        String s2 = "vaja";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
