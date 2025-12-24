import java.util.*;
class main{
    
    public static void kNum(ArrayList<Integer> list,int n){
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list.get(n-1));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        int n = sc.nextInt();
        String[] arr = input.split(",");
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            array.add(Integer.parseInt(arr[i]));
        }
        kNum(array,n);
    }
}