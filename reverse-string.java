// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main{
    public static void main(String[] args){
        String s = "Fiserv Germany";
        StringBuilder reversed = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            reversed.append(s.charAt(i));
        }
        System.out.println(reversed);
    }
}
