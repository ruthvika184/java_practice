//write a program that takes a word W as input and prints "Hello" followed by given word W.

import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String W = sc.nextLine();
        System.out.println("Hello "+ W);
        sc.close();
    }
}
