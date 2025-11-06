import java.util.*;
class main{
    public static void main(String[]args){
        HashSet<Integer> numbers = new HashSet<>();
             HashSet<Integer> numbers2 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String input1 =  sc.nextLine();
                String input2 =  sc.nextLine();
       
        String[] arr1 = input1.split(",");
        for(int i=0;i<arr1.length;i++){
            numbers.add(Integer.valueOf(arr1[i]));
        }
        String[] arr2 = input2.split(",");
        for(int i=0;i<arr2.length;i++){
            numbers2.add(Integer.valueOf(arr2[i]));
        }
        numbers.retainAll(numbers2);
        ArrayList<Integer> num = new ArrayList<>(numbers);
        Collections.sort(num);
        System.out.print(num);
    }
}