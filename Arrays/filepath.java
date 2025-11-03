import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] msg = line.split(" ");
        ArrayList<String> name = new ArrayList<>(Arrays.asList(msg));
        if(name.get(2).equals("WIN")){
                name.remove("WIN");
            String file = String.join(">",name);

            System.out.print(file);
        }else if(name.get(2).equals("LINUX")){
                    name.remove("LINUX");
         String file = String.join("/",name);

        System.out.print(file);   
        }
    }
}