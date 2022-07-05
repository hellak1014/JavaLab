package day4;
import java.util.Random;
import java.util.Scanner;

public class day4_22 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int no = 10 + rand.nextInt(99);
        System.out.println("number game start!");
        System.out.println("you choose number 10~99.");
        
        int num;

        while(true) {
            System.out.println("number?");
            
            num = scanner.nextInt();

                if (num>no) {
                    System.out.println("more less");
                } else if (num<no) {
                    System.out.println("more big");
                } else {
                    System.out.println("Right!");
                } 
                } 

    
}

}