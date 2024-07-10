import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int first=0;
        int last=word.length()-1;
        while(first<word.length() && last>=0){
            for(int index=0;index<word.length();index++){
                if(index==first || index==last){
                    System.out.print(word.charAt(index));
                }
                else{
                   System.out.print(" "); 
                }
            }
            first++;
            last--;
            System.out.println("");
        }
    }
}
