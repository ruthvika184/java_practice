import java.util.Scanner;
class Main {
    static void getSpeedStatus(int speed) {
        if(speed<60){
            System.out.println("Normal");
        }
        else if(speed<80){
            System.out.println("Warning");
        }else if(speed>=80){
            System.out.println("Over Speed");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();

        getSpeedStatus(speed);
        sc.close();
    }

}