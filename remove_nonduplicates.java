// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main{
    public static void main(String[] args){
        String s = "Fiserv Germany";
        Set<Character> nonduplicates = new LinkedHashSet<>();
        for(char c:s.toCharArray()){
            nonduplicates.add(c);
        }
        StringBuilder result = new StringBuilder();
        for(char c:nonduplicates){
            result.append(c);
        }
        System.out.println(result);
    }
}
