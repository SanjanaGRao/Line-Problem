import java.util.Scanner;

public class LineComparisonUC3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//line 1 co-ordinates
		System.out.println(" FOR LINE 1: ");
		System.out.println("Enter the first x co-ordinate value (x1): "); 
		int Ax1= scn.nextInt(); 
		System.out.println("Enter the first y co-ordinate value (y1): "); 
		int Ay1= scn.nextInt(); 
		System.out.println("Enter the second x co-ordinate value (x2): "); 
		int Ax2= scn.nextInt(); 
		System.out.println("Enter the second y co-ordinate value (y2): "); 
		int Ay2= scn.nextInt();
		int Ax = Ax2 - Ax1;
		int Ay = Ay2 - Ay1;
		int length1 = (int) Math.sqrt((Math.pow(Ax,2)) + (Math.pow(Ay,2)));
		Integer l1 = new Integer(length1);
		
		//line 2 co-ordinates
		System.out.println(" FOR LINE 2: ");
		System.out.println("Enter the first x co-ordinate value (x1): "); 
		int Bx1= scn.nextInt(); 
		System.out.println("Enter the first y co-ordinate value (y1): "); 
		int By1= scn.nextInt(); 
		System.out.println("Enter the second x co-ordinate value (x2): "); 
		int Bx2= scn.nextInt(); 
		System.out.println("Enter the second y co-ordinate value (y2): "); 
		int By2= scn.nextInt();
		int Bx = Bx2 - Bx1;
		int By = By2 - By1;
		int length2 = (int) Math.sqrt((Math.pow(Bx,2)) + (Math.pow(By,2)));
		Integer l2 = new Integer(length2);
		
		//comparing two lines
		int result = l1.compareTo(l2);
		if(result>0)
			System.out.println("The length of Line 1 is greater than Line 2.");
		else if(result<0)
			System.out.println("The length of Line 1 is lesser than Line 2.");
		else
			System.out.println("The length of the lines are equal.");
		
		System.out.println(" The length of the line 1: " + length1);
		System.out.println(" The length of the line 2: " + length2);

	}

}