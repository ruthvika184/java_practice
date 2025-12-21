import java.util.*;
class Main {

    static int MultiplyByThree(int a)
    {
        a=a*3;
        System.out.print(a);
        return a;
        // Write your code here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        MultiplyByThree(a);
        // Call the function
        sc.close();

    }
    
}