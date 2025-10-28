import java.util.*;
import java.util.Arrays;
class main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr= new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int size = Math.min(rows,cols);
        int[] diagnal = new int[size];
        for(int i=0;i<size;i++){
                diagnal[i]=arr[i][i];
            }
             System.out.println(Arrays.toString(diagnal));
    }
}