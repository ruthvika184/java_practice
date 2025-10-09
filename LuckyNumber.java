//Given 2 integers they are considered a lucky pair if any one of them is 6 or if their sum  or difference is equal to 6.


import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        if(i1 == 6 || i2==6 || i1+i2 == 6 || i1-i2 ==6 || i2-i1 == 6){
            System.out.println("Lucky");
        }else{
            System.out.println("Not Lucky");
        }
    }
}