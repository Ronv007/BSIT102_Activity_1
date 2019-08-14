// BSIT102
//Ron Villanueva
//Kyle Lardizabal
import java.util.*;
 
public class BSIT102_Activity1 {
    
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Basic Calc");
    	System.out.println("Enter First Number");
    	int num1 = scan.nextInt();
    	System.out.println("Enter Second Number");
    	int num2 = scan.nextInt();

        System.out.println(" ");
        System.out.println("Answers: ");
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 * num2;
		int num6 = num1 / num2;
    	System.out.println("The sum is: " + num3);
    	System.out.println("The difference is " + num4);
    	System.out.println("The product is " + num5);
    	System.out.println("The quotient is " + num6);
    }
}
