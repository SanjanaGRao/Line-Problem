import java.util.*;

public class LineComparisonUC1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first x co-ordinate value (x1): "); 
		int x1= sc.nextInt(); 
		System.out.println("Enter the first y co-ordinate value (y1): "); 
		int y1= sc.nextInt(); 
		System.out.println("Enter the second x co-ordinate value (x2): "); 
		int x2= sc.nextInt(); 
		System.out.println("Enter the second y co-ordinate value (y2): "); 
		int y2= sc.nextInt();
		int x = x2 - x1;
		int y = y2 - y1;
		double length = Math.sqrt((Math.pow(x,2)) + (Math.pow(y,2)));
		System.out.println(" The length of the line is: " + length);
	}

}
