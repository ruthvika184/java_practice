import java.util.*;
class main{
    public static void main(String[]args){
        ArrayList<Integer> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum =0;
        while(sc.hasNextInt()){
            int nums = sc.nextInt();
            num.add(nums);
            sum=sum+nums;
        }
        if(num.size()>0){
            double avg = (double)sum/num.size();
            avg = Math.round(avg*100.0)/100.0;
            String result = String.valueOf(avg);
            System.out.print(result);
        }
    }
}