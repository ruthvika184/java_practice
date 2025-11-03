import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] msg = line.split(" ");
        ArrayList<String> name = new ArrayList<>(Arrays.asList(msg));
        if(name.contains("WIN")){
                name.remove("WIN");
            String file = String.join(">",name);

            System.out.print(file);
        }else if(name.contains("LINUX")){
                    name.remove("LINUX");
         String file = String.join("/",name);

        System.out.print(file);   
        }
    }
}