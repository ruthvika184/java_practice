import java.util.*;
class Main {
    static void calculate_bill(double num){
        if(num>=2500){
            System.out.println(num - (num*0.20));
        }else if(num>=500){
            System.out.println(num - (num*0.10));
        }
        else if(num<500){
            System.out.println(num - (num*0.05));
        }
    }
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        calculate_bill(input);
    }
}