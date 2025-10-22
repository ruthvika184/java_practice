import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum=0;
        int digits=String.valueOf(n).length();
        while(n>0){
            int digit = n%10;
            sum = sum +(int)Math.pow(digit,digits);
            n=n/10;
        }
        if(sum==original){
            System.out.print("Armstrong Number");
        }else{
            System.out.print("Not an Armstrong Number");
        }
    }
}