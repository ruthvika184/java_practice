import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++){
            int idx = sc.nextInt();
            result= result+str.charAt(idx);
        }
        System.out.print(result);
    }
}