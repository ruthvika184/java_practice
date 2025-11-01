import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(int i=0;i<rows;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<cols;j++){
                row.add(sc.nextInt());
            }
            matrix.add(row);
        }
        for(int i=0;i<rows;i++){
            ArrayList<Integer> lowerRow = new ArrayList<>();
            for(int j=0;j<=i&&j<cols;j++){
                lowerRow.add(matrix.get(i).get(j));
            }    
            System.out.println(lowerRow);
        }
    }
}