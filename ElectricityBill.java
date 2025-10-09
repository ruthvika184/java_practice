/* Charges 2/unit for 0 to 50 units => 50 x 2 = 100 
   Charges 3/unit for 51 to 150 units => 100 x 3 = 300 
   Charges 5/unit for 151 to 250 => 50 x 5 = 250 
   Charges 8/unit for 251 and above => 0 x 8 = 0 
----------------------------------------------------- 
Total => 650 Surcharge (20 % of Bill) => 650 x 0.2 = 130 
----------------------------------------------------- 
Bill => 780.0 
------------------------------------------------------ */


import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        double bill = 0;
        if(unit<=50){
            bill = unit*2;
        }else if(unit>51 && unit<150){
            bill = (50*2)+(unit-50)*3;
        }else if(unit>151 && unit<250){
           bill = (50*2)+(100*3)+(unit-150)*5;
        }else if(unit>=251){
          bill = (50*2)+(100*3)+(100*5)+(unit-250)*8;
        }
        double surcharge = bill*0.2;
        double totalBill = bill+surcharge;
        System.out.println(totalBill);
    }
}