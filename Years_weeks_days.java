/* given n number of days as input, write a program to convert n number of days into years y,weeks w,and days d
take 1yr = 365 days */ 

import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int years = input/365;             // 1329/365 = 3 -- 3*365=1095;
        int rem_days = input%365;       // 1329%365 = 234 or 1329-1095;
        int weeks = rem_days/7;         // 234/7 = 33   --- 33*7=231;
        int days = rem_days%7;          // 234%7 = 3  or 234-231 = 3;
        System.out.println(years);
        System.out.println(weeks);
        System.out.println(days);
    }
}
