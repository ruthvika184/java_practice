import java.util.*;
class main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int temp =i;
            while(temp>0){
                sum++;
                temp/=10;
            }
        }
        System.out.print(sum);
    }
}