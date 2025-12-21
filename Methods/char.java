import java.util.*;
class Main {
    static Character secondChar(String a) {
        // Write your code here
        char character = a.charAt(1);
        System.out.println(character);
        return character;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        secondChar(n);
        // Call the function
        sc.close();
    }
}