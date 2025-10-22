import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int root1 = (int)Math.ceil(Math.sqrt(a));
        int root2 = (int)Math.floor(Math.sqrt(b));
        int count =0;
        if(root1<=root2){
            count=root2-root1+1;
        }
                System.out.print(count);
    }
}