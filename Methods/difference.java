import java.util.*;
class main{
    static void diff(ArrayList<Integer> list){
        Collections.sort(list);
        int min = list.get(0);
        int max = list.get(list.size()-1);
        System.out.println(max-min);
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr  = input.split(",");
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            array.add(Integer.parseInt(arr[i]));
        }
        diff(array);
    }
}