import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean isPrime=true;
        if(n<=1){
            System.out.print("Not a Prime Number");
            return;
        }
        for(int i=2;i<n;i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
            if(isPrime){
                System.out.print("Prime Number");
            }else{
                System.out.print("Not a Prime Number");
            }
    }
}