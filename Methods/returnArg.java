import java.util.*;
class main{
    static int getArg(int arg){
        System.out.println(arg);
        return arg;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        getArg(input);
    }
}