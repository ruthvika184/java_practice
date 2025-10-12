import java.util.*;
class main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Boolean hasUpper = false;
        Boolean hasLower = false;
        Boolean hasDigit = false;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                hasDigit=true;
            }
            if(Character.isUpperCase(ch)){
                hasUpper=true;
            }
            if(Character.isLowerCase(ch)){
                hasLower=true;
            }
        }
        if(hasDigit&&hasLower&&hasUpper){
            System.out.println("Valid Password");
        }
        else{
            System.out.print("Invalid Password");
        }
    }
}