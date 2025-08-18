//write a program to print the given input word N times in a single line seperated by space.

import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int input2 = sc.nextInt();
        System.out.println((input+" ").repeat( input2));
    }
}