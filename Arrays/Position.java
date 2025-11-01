/* You are given a sorted array of n elements and an element k is to be added to the array such that the array should remain sorted. 
Find and print the position of the k and print the array. 
Print the position of k as 0 if it is already present in the array.*/

import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> elements = new ArrayList<>();
        for(int i=0;i<n;i++){
            elements.add(sc.nextInt());
        }
         elements.add(k);
         Collections.sort(elements);
         int index = elements.indexOf((Integer)k);
         System.out.println(index);
         System.out.print(elements);
    }
}