/* given a student has scored M marks in maths, P marks in physics, C marks in chemistry. Write a program to check if a student is eligible for admission in a professional course.
if any of the below conditions is satisfied then the student is eligible:
-> M>=70 and P>=60 and C >=60
-> M+P+C >=180 */

import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int num = input1+input2+input3;
        if(input1>=70 && input2>=60 && input3>=60){
            System.out.println("True");
        }else if(num>=180){
                System.out.println("True");
        }else{
            System.out.println("False");       
        }
    }
}
