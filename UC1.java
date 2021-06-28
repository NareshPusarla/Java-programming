import java.util.Scanner;
public class UC1{
        public static void main(String[] args){
                System.out.println("Welcome");
                int fullday= 1;
                System.out.println("Welcome");
                for(int i=1;i<=20;i++){
                double check = Math.floor(Math.random()*10)%2;
                if(check == fullday){
                        System.out.println("present");

                }else{
                        System.out.println("absent");
                        }
                }
}
}
