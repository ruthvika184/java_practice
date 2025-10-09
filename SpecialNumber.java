/* Write a program to read a single line of input, which is a 2-digit integer, and print special number if any of the following conditions are satisfied. 
1. The sum of digits is 7. 
2. One of the digits is 7. 
3. The number is a multiple of 7.
print normal number in all other cases */



import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in=sc.nextInt();
        int ones = in%10;
        int tens = (in/10)%10;
        int sum = ones+tens;
        if(sum == 7 || ones == 7|| tens == 7 || in%7 == 0){
            System.out.println("Special Number");
        }else{
            System.out.println("Normal Number");
        }
    }
}