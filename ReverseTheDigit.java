//write a program to read a single line of input,which is a two digit integer,and print the two-digit number by reversing the digits in it.

import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int tens = input/10;
        int ones = input % 10;
        int reverse = ones * 10+tens;
        System.out.printf("%02d",reverse);
    }
}