import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        if(i1>i2&&i1>i3){
            System.out.println(i1);
        }else if(i2>i3){
            System.out.println(i2);
        }else{
            System.out.println(i3);
        }
    }
}