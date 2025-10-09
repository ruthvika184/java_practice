/* For this problem, you need to write code to read a single line of input and print the line after the message "Given input:". */

import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Given input: "+input);
    }
}