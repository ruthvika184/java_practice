import java.util.Scanner;
class main{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int thousands = (num/1000)%10;
        int hundreds = (num/100)%10;
        int tens = (num/10)%10;
        int ones = num%10;
        int sum = thousands+hundreds+tens+ones;
        System.out.println(sum);
    }
}