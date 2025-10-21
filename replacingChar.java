import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1="";
        for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(ch== ' '){
               str1=str1+ch;
           }else{
               ch = (char)(ch+1);
           str1=str1+ch;
           }
           
        }
        System.out.print(str1);
    }
}