import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] words = n.split(" ");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }
}