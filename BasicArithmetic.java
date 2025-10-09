/* write a program to take two integer inputs and print the result of the following operations:
1. Addition
2. Subtraction
3. Multiplication */

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1= sc.nextInt();
        int input2=sc.nextInt();
        System.out.println(input1 + input2);
        System.out.println(input1 - input2);
        System.out.println(input1 * input2);
    }
}