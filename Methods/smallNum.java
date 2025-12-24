import java.util.*;
class main{
    static void smallNum(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println(list.get(0));
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(",");
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            array.add(Integer.parseInt(arr[i]));
        }
        smallNum(array);
    }
}