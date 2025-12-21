import java.util.Scanner;

class Main {

    static void validateAtmPinCode(String pin) {
        // Write your code here
        Boolean isValid = true;
        if(pin.length()==4 || pin.length()==6){
            for(int i=0;i<pin.length();i++){
                if(Character.isDigit(pin.charAt(i))==false){
                    isValid=false;
                }
            }
            if(isValid==true){
                System.out.println("Valid PIN Code");
            }else{
                System.out.println("Invalid PIN Code");
            }
        }else{
            System.out.println("Invalid PIN Code");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pin = sc.nextLine();
        // Call the function
        validateAtmPinCode(pin);
        sc.close();
    }

}