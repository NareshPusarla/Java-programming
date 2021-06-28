import java.util.Scanner;
public class LeapYear{
	public static void main(String args[]){
		Scanner y = new Scanner(System.in);
		System.out.println("Enter the year to check: ");
		int year = y.nextInt();
		if (year%4 == 0){
		System.out.println("Leap year");
		}
		else{
                System.out.println("not Leap year");
		}
}
}
