import java.util.*;
class main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");        }
    }
}