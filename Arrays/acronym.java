import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");
        ArrayList<String> acro = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(!words[i].isEmpty()){
                acro.add(words[i].substring(0,1));
            }
        }
        String acrony = String.join(".",acro);
        System.out.print(acrony);
    }
}