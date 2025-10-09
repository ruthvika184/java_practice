//Write a program which prints the first half of the given input word.

import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.substring(0,(input.length()/2)));
    }
}