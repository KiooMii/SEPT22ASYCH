import java.util.Scanner;
public class Problem4 {
    
    public static void main(String arg[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input the first number");
        char firstnum = input.next().charAt(0);
        System.out.println("Input the second number");
        double secondnum = input.nextDouble();
        int sum = firstnum + ((int)secondnum);
        System.out.println(sum);
        
    
    
    
    
    }
    
}
