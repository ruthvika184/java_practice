import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        int l = sc.nextInt();
        int count =0;
        for(int i=1;i<=l;i++){
            for(int j=i;j<=l;j++){
                int square = i*i+j*j;
                int root = (int)Math.sqrt(square);
                if(root*root==square && root<=l){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}