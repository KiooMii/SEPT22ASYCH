import java.util.Scanner;
public class Problem4 {
    
    public static void main(String arg[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input the first number");
        char firstnum = input.next().charAt(0);
        System.out.println("Input the second number");
        double secondnum = input.nextDouble();
        int sum = firstnum + ((int)secondnum);
        float sumf= firstnum + ((float)secondnum);
        float sum2 = sum;
        int sum3 = (int)sumf;
        
        System.out.println("The output in float is " + sum2);
        System.out.println("The output in int is " + sum3);
        
    
    
    
    
    }
    
}
