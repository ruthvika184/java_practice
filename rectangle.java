//write a program to print a solid rectangle pattern rows and cols using (*).


import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        for(int count=0;count<rows;count++){
            for(int count1 =0;count1<cols;count1++){
                System.out.print("* ");
            }
                System.out.println("");
        }

    }
}