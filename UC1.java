import java.util.Scanner;
public class UC1{
	public static void main(String[] args){
		int totalSal = 0;
		Scanner sal = new Scanner(System.in);
		System.out.println("Enter the salary per day: ");
		int daySal = sal.nextInt();
		int fullday= 1;
		System.out.println("Welcome");
		for(int i=1;i<=20;i++){
		double check = Math.floor(Math.random()*10)%2;
		if(check == fullday){	
			totalSal = totalSal+daySal;

		}}
		System.out.println(totalSal);
	
}
}
