import java.util.Scanner;
public class Problem1 {
    
    public static void main(String args[]){
        
        
        String firstname = "Kiel";
        String Lastname = "Mingote";
        Scanner name = new Scanner(System.in);
        System.out.println("Input first name or last name");
        String in = name.nextLine();
        
        if(in.equalsIgnoreCase(firstname)){
        boolean fname = true;
        System.out.println(fname);
        
        }
        else if(in.equalsIgnoreCase(Lastname)){
            boolean lname = false;
        System.out.println(lname);
        
        }
        
                
    
    
    }
    
}
