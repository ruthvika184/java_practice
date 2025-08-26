/* A company decided to give a bonus of 5% to employees if his/her yrs of service is more than five yrs.
Write a program that reads and employees salary and years of service and decides whether the employee gets the bonus or not. */

import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int exp = sc.nextInt();
        double bonus = salary * 0.05;
        if(exp>5){
            System.out.println(bonus);
        }else{
            System.out.println("No bonus");
        }
    }
}