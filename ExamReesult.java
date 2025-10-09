//write a program that reads the student marks as input and print PASS if the student has scored more than 50,in all other cases print FAIL.

import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.length()>2){
            String middle = input.substring(1,input.length()-1);
            middle = middle.replaceAll(".","*");
            String result = input.charAt(0)+middle+input.charAt(input.length()-1);
            System.out.println(result);
        }else if(input.length()==2){
            System.out.println(input);
        }else{
            System.out.println(input);
        }
    }
}