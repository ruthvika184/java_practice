//Write a program that prints the last character of a given word.

import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        char lastChar = input.charAt(input.length()-1);
        System.out.println(lastChar);
    }
}