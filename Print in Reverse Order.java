// Write a program that reads two lines of input and prints those two lines in the reverse order.

import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        System.out.println(input2);
        System.out.println(input1);
    }
}