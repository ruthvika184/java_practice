import java.util.*;
class main{
    public static void main(String[]args){
        ArrayList<Integer> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        int sum=0;
        while(sc.hasNextInt()){
            int nums = sc.nextInt();
            num.add(nums);
            sum=sum+nums;
        }
        System.out.print(sum);
    }
}