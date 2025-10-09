// print area and perimeter of a square

import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int area = input*input;
        int peri = 4 * input;
        System.out.println("Area of the square is: "+area);
        System.out.println("Perimeter of the square is: "+ peri);
    }
}