import java.util.*;
class main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");
        Collections.reverse(Arrays.asList(words));
        System.out.print(String.join(" ",words));
    }
}