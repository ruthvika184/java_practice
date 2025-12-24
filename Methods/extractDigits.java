import java.util.*;
class main{
    static void digits(String str){
        ArrayList<Integer> digits = new ArrayList<>();
        int sum =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                digits.add(ch - '0');
            }
        }
        Collections.sort(digits);
        for(int j=0;j<digits.size();j++){
            sum=sum+digits.get(j);
        }
        int min = digits.get(0);
        int max=digits.get(digits.size()-1);
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        digits(input);
    }
}