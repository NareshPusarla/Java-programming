import java.util.Scanner;
public class UC3{
        public static void main(String[] args){
		int hourWage = 20;
		int dayHour = 8;
		int partHour = 4;
		int parttimeWage = 0;
		int totalWage = 0;
		int fullTime = 2;
		int partTime = 1;
                System.out.println("Welcome");
                for(int i=1;i<=20;i++){
                double check = Math.floor(Math.random()*10)%3;
                if(check == fullTime){
                        totalWage = totalWage+(hourWage*dayHour);

                }else{
			parttimeWage = parttimeWage+(partHour*hourWage);
			}
                }
		System.out.println("full time's emp wage: "+totalWage);
		System.out.println("part time's emp wage: "+parttimeWage);
}
}
