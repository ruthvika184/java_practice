import java.util.Scanner;
class Main {
    static void getLowerAndUpperCaseLetters(String s) {
        // Write your code here
        String uppr = "";
        String lwr = "";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                uppr=uppr+s.charAt(i);
            }
            else if(Character.isLowerCase(s.charAt(i))){
                lwr=lwr+s.charAt(i);
            }
        }
        System.out.println(uppr);
        System.out.println(lwr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // Call the function
        getLowerAndUpperCaseLetters(s);
        sc.close();

    }

}