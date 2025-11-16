import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        while(sc.hasNextInt()){
            numbers.add(sc.nextInt());
        } 
        ArrayList<Integer> arrlist = new ArrayList<>(numbers);
        Collections.sort(arrlist);
        System.out.print(arrlist);
    }
}