import java.util.*;
class main{
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         int rows = sc.nextInt();
         int cols = sc.nextInt();
         int[][] arr = new int[rows][cols];
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 arr[i][j]=sc.nextInt();
             }
         }
         int[][] trans = new int[cols][rows];
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 trans[j][i]  = arr[i][j];
             }
         }
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(trans[i][j]+" ");
            }
             System.out.println();
        }
    }
}