import java.util.*;
class main{
    static int fact(int num){
        if(num==1){
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int input = sc.nextInt();
        int result = fact(input);
        System.out.println(result);
    }
}