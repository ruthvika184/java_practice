//Given a word and a number(N),write a program to print the last three characters  of a word Ntimes in a single line.

import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        int input2 = sc.nextInt();
        String sub = input1.substring(input1.length()-3);
        String fin = sub.repeat(input2);
        System.out.println(fin);
    }
}