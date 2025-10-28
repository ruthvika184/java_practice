import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] subArr = Arrays.copyOfRange(arr,0,2);
        int[] subArr1 = Arrays.copyOfRange(arr,arr.length-2,arr.length);
        int[] arr2 = new int[subArr.length + subArr1.length];
        System.arraycopy(subArr,0,arr2,0,subArr.length);
        System.arraycopy(subArr1,0,arr2,subArr.length,subArr1.length);
        System.out.print(Arrays.toString(arr2));
    }
}