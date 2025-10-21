import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String i1 = sc.nextLine();
        String i2 = sc.nextLine();
        int j=0;
        for(int i=0;i<i1.length()&&j<i2.length();i++){
           if(i1.charAt(i)==i2.charAt(j)){
              j++;
           }
    }
    if(j==i2.length()){
        System.out.print("Yes");
    }else{
        System.out.print("No");
    }
}
}