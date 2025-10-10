import java.util.*;
class main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int n;
        for(int i=0;i<10;i++){
            n= sc.nextInt();
            sum = sum+n;
        }
        double average=sum/10.0;
        System.out.println(sum);
        System.out.println(average);
    }
}