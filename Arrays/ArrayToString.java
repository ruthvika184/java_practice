import java.util.*;
class main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String value = sc.nextLine();
        String[] parts = value.split(" ");
        ArrayList<String> names = new ArrayList<>(Arrays.asList(parts));
        String replaced = String.join(",",names);
        System.out.print(replaced);
    }
}