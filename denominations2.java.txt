import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int thous = m/2000;
        m=m%2000;
        int hund = m/500;
        m=m%500;
        int twohund=m/200;
        m=m%200;
        int fifty = m/50;
        m=m%50;
        int twenty = m/20;
        m=m%20;
        int five = m/5;
        m=m%5;
        int two = m/2;
        m=m%2;
        int one = m/1;
        System.out.print("2000:"+thous+" "+"500:"+hund+" "+"200:"+twohund+" "+"50:"+fifty+" "+"20:"+twenty+" "+"5:"+five+" "+"2:"+two+" "+"1:"+one);
        };
}