import java.util.*;
class main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        boolean found =false;
        for(int i=a;i<=b;i++){
            int num =i;
            int len = String.valueOf(i).length();
                    int sum=0;
            while(num>0){
                 int digit = num%10;
            sum = sum + (int)Math.pow(digit,len);
            num=num/10;
            }
            if(sum==i){
                System.out.print(i+" ");
                found = true;
            }
        }
        if(!found){
            System.out.print(-1);
        }
    }
}