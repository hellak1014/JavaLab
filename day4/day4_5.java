package day4;
import java.util.Scanner;

public class day4_5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("count.");
        System.out.println("number?");
        int number = scanner.nextInt();

       
            for (int i = number; i >= 0; i--){
                System.out.println("*");
            }


    }
}
