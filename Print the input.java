/* Write a program that reads a single line of input and print the given input. 
Sample input 1 - BAT. 
Sample output 1 - BAT. */ 


import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);    
    }
}