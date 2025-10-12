//checks whether the string has atleast one digit if yes then it is valid

import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Boolean hasDigit=false;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                hasDigit=true;
                break;
            }
        }
        if(hasDigit){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }
}