import java.util.Scanner;
class Main {
    static void sumOfSquaresMToN(int a, int b) {
        int sum=0;
        for(int i=a;i<=b;i++){
            sum = sum+(int)Math.pow(i,2);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Call the function
        sumOfSquaresMToN(a,b);
        sc.close();
    }

}