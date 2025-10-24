import java.util.*;
import java.util.Arrays;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] repeat = new int[n];
        for(int i=0;i<n;i++){
            repeat[i]=m;
        }
         System.out.print(Arrays.toString(repeat));   
    }
}