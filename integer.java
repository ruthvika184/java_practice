// write a program to print integers from 1 to the given integer(n).


import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int num = 0;
        for(int counter = 0;counter<input;counter=counter+1){
            num = num+1;
            System.out.println(num);
        }
    }
}