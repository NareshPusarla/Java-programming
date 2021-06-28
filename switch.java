import java.util.Scanner;
public class Switch{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day number");
		int day = scanner.nextInt();
		switch(day){
		case 1:
			System.out.println("Mon");
			break;
		case 2:
                        System.out.println("Tue");
                        break;
		case 3:
                        System.out.println("wed");
                        break;
		case 4:
                        System.out.println("Thur");
                        break;
		case 5:
                        System.out.println("Fri");
                        break;
		case 6:
                        System.out.println("Sat");
                        break;
		default:
			System.out.println("Out of day");
		}
}
}
