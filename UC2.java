import java.util.Scanner;
public class UC2{
        public static void main(String[] args){
		int hourWage = 20;
		int dayHour = 8;
		int totalWage = 0;
                int fullday= 1;
                System.out.println("Welcome");
                for(int i=1;i<=20;i++){
                double check = Math.floor(Math.random()*10)%2;
                if(check == fullday){
                        totalWage = totalWage + (hourWage*dayHour);

                }
                }
		System.out.println(totalWage);
}
}
