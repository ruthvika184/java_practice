import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num<min){
                min=num;
            }
        }
        System.out.print(min);
    }
}