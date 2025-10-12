import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
            if (n%i==0){
                sum=sum+i;
            } 
        }
        sum=sum-n;
        if(sum==n){
            System.out.print("Perfect Number");
        }else{
            System.out.print("Not a Perfect Number");
        }
    }
}