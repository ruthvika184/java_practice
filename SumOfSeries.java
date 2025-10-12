import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int term =0;
        for(int i=1;i<=n;i++){
            term = term*10+2;
            sum = sum +term;
        }
        System.out.print(sum);
    }
}