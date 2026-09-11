// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main{
    public static void main(String[] args){
        String s = "Fiserv Germany";
        Map<Character,Integer> frequency = new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            frequency.put(c,frequency.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(frequency.getOrDefault(c,0)==1){
                System.out.println(c);
                break;
            }
        }
        System.out.println(frequency);
    }
}
