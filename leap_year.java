import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4 == 0 ){
            if(year%100 == 0 ){
                if(year%400 ==0) {
                    System.out.println("True");
                } else{
                 System.out.println("False");
                }
                }else{
                    System.out.println("True");
                }
            }else{
                System.out.println("False");
            }
      }
}