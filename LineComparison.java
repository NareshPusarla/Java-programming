import java.util.Scanner;
public class LineComparison{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the x1: ");
		//int range = sc1.nextInt();
		int x1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the x2: ");
		int x2 = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the y1: ");
		int y1 = sc3.nextInt();
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter the y2: ");
		int y2 = sc4.nextInt();

		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		LineComparisonCode l = new LineComparisonCode();
		double result = l.length(x1,x2,y1,y2);
		System.out.println("Length of 2 points" + result);
	}
}
