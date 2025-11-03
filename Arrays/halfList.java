import java.util.*;
class Main {
    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       ArrayList<Integer> num = new ArrayList<>();
       for(int i=0;i<n;i++){
           int values = sc.nextInt();
           num.add(values);
       }
       int half = (n+1)/2;
       List<Integer> list = num.subList(half,num.size());
       System.out.print(list);
    }
}