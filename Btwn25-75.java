//print true if the integer is between 25 and 75

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(25<input){
            if(input<75){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }else{
            System.out.println("False");
        }
    }
}