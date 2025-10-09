//write a program to read two lines of input and print the word after removing the character at the given index.

import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int i = sc.nextInt();
        if(i<input.length()){
            String result = input.substring(0,i)+input.substring(i+1);
            System.out.println(result);
        }else{
            System.out.println(input);
        }
    }
}