// printing numbers between given range 

import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for( int num = m;num<=n;num++){
        System.out.println(num);
        }
    }
}