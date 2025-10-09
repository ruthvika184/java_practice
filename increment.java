//write a program to increment n by 5 if n is greater than 10 otherwise by 1.

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input= sc.nextInt();
        if(input<10){
            System.out.println(input+1);
        }else{
            System.out.println(input+5);
        }
    }
}