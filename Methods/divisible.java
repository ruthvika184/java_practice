import java.util.Scanner;
class Main {
    static int divisibleBySeven(int a)
    {
        // Write your code here
        if(a%7==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        return a;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // Call the function
        divisibleBySeven(a);
        sc.close();
    }
}
