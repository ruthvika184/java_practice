//write a program that prints the second half of the string . Assume string length = even.


import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.substring(input.length()/2));
    }
}