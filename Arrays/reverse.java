import java.util.*;
class main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        String names[] = new String[n];
        for(int i=0;i<n;i++){
            names[i] = sc.nextLine();
  
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(names[i]);
        }
 
          
    }
}