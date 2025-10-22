import java.util.*;
import java.math.BigInteger;
class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger sum=BigInteger.ZERO;
        for(int i=0;i<=n;i++){
            BigInteger num = BigInteger.valueOf(i);
            BigInteger square = num.multiply(num);
            sum = sum.add(square);
        }
        System.out.print(sum);
    }
}