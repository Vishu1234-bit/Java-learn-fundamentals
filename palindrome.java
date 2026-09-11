// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main{
    public static void main(String[] args){
        String s = "madam";
        String result = new StringBuilder(s).reverse().toString();
        if(s.equals(result)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
