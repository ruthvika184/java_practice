import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
       String[] arr = words.split(" ");
            ArrayList<String> lines = new ArrayList<>(Arrays.asList(arr));
            Collections.reverse(lines);
      
        System.out.print(lines);
    }
}
