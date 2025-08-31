/* sample input 1 : 5
sample output : 10 // 4+3+2+1 */


import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input =  sc.nextInt();
        int sum = input *(input-1)/2;
        System.out.println(sum);
    }
}