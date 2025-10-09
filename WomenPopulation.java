/* In a Town, the percentage of men is 52 and the rest are women(W).The total population(T)of town is given as input..
Write a program to print the total number of women in the town. */


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        // given men = 52% so women would be 48%
        System.out.println( input * 48/100);
    }
}
