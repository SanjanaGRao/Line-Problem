
import java.util.Scanner;

public class LineComparisonUC4 {
	
	//class members
	private int x;
	private int y;
	
	//Constructor for LineComaprisonUC3
	public LineComparisonUC4(int x , int y)
	{
		this.x = x;
		this.y = y;
	}
	
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
		
		//Object Creation for Line 1
		LineComparisonUC4 point1 = new LineComparisonUC4(Ax1,Ay1); //Object creation for point 1
		LineComparisonUC4 point2 = new LineComparisonUC4(Ax2,Ay2);//object creation for point 2
		
		int Ax = point2.x - point1.x;//using OOP Concepts
		int Ay = point2.y - point1.y;
		//computing the length
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
		
		//Object Creation for Line 2
		LineComparisonUC4 point3 = new LineComparisonUC4(Bx1,By1); //Object creation for point 3
		LineComparisonUC4 point4 = new LineComparisonUC4(Bx2,By2);//object creation for point 4
		
		int Bx = point4.x - point3.x; //using OOP concepts
		int By = point4.y - point3.y;
		//computing the length
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
		
		//Ouput
		System.out.println(" The length of the line 1: " + length1);
		System.out.println(" The length of the line 2: " + length2);
		scn.close();
	}
}
