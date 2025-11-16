import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> multiples2 = new ArrayList<>();
        ArrayList<Integer> multiples3 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            multiples2.add(2*i);
            multiples3.add(3*i);
        }
        ArrayList<Integer> line1 = new ArrayList<>(multiples2);
        line1.removeAll(multiples3);
        System.out.println(line1);
        
        HashSet<Integer> set = new HashSet<>();
        set.addAll(multiples2);
        set.addAll(multiples3);
        
        for(int val:multiples2){
          if(multiples3.contains(val)){
            set.remove(val);
          }
        }
        System.out.println(set);
    }
}