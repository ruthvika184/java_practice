// the input string should be more than 7 characters or else it should be returning false.

import java.util.Scanner;
class main{
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.length()<7){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}