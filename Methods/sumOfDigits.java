import java.util.*;
class main{
    static void sumDigits(int n){
        int sum=0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        int input = sc.nextInt();
        sumDigits(input);
    }
}