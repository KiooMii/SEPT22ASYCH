import java.util.Scanner;
public class Problem5 {
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the area of the shape you want to compute for (square, triangle, rectangle)");
		String shape = in.nextLine();
                
                if(shape.equals("square")){
		
        System.out.println("Enter the the measurement of the side of the square");
        int measurement = in.nextInt();
        long comp = measurement * measurement;
        System.out.println("The area of the square is " + comp);
                
                }
                
                if (shape.equals("rectangle")){
		
        System.out.println("Enter the the height of the rectangle");
        int measurement1 = in.nextInt();
        System.out.println("Enter the the width of the rectangle");
        int measurement2 = in.nextInt();
        int comp = measurement1 * measurement2;
        System.out.println("The area of the rectangle is " + comp);
                
                }
                
                if (shape.equals("triangle")){
		
        System.out.println("Enter the the height of the triangle");
        double measurement3 = in.nextDouble();
        System.out.println("Enter the the base of the triangle");
        float measurement4 = in.nextFloat();
        double comp = (measurement4 / 2) * measurement3;
        System.out.println("The area of the triangle " + comp);
                
                }
                
                
                   
        
        
    
    }
       
        
        
        
    }