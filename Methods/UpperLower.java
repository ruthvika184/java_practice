import java.util.*;
class Main {
    static void CountOfLowercaseAndUppercaseLetters(String str)
    {
        int count1=0;
        int count2=0;
        for(int i=0;i<str.length();i++){
           if(Character.isUpperCase(str.charAt(i))){
               count1++;
           } else if(Character.isLowerCase(str.charAt(i))){
               count2++;
           }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        String chars= sc.nextLine();
        CountOfLowercaseAndUppercaseLetters(chars);
        sc.close();
    }
}