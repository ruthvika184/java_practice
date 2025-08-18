//Given a word W and an integer N , write a program to print the character present at the index N in the woord W.

import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        int input2 = sc.nextInt();
        System.out.println(input1.charAt(input2));
    }
}