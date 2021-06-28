import java.util.Scanner;
public class UC4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter either part-time or full-time: ");
		String type = sc.nextLine();
		int hourWage = 20;
		int dayHour = 8;
		int partHour = 4;
		int parttimeWage = 0;
		int totalWage = 0;
		int fullTime = 2;
		int partTime = 1;
                System.out.println("Welcome");
		switch(type){
		case "full-time":
			for(int i=1;i<=20;i++){
                	double check = Math.floor(Math.random()*10)%3;
                	if(check == fullTime){
                        totalWage = totalWage+(hourWage*dayHour);}}
			System.out.println("full time's emp wage: "+totalWage);
			break;
		case "part-time":
			for(int i=1;i<=20;i++){
                        double check = Math.floor(Math.random()*10)%3;
			if(check == partTime){
			parttimeWage = parttimeWage+(partHour*hourWage);}}
			System.out.println("part time's emp wage: "+parttimeWage);
		}
}
}

