package day4;
import java.util.Scanner;
public class day4_17 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while(true) {
        System.out.println("(1) squre");
        System.out.println("(2) squre ROOT");
        System.out.println("(3) log");
        System.out.print("Choose Number? (1~3, 0:Done) > ");
        int num = scanner.nextInt();

        if(num==0) {
            break;
        } else if (1 <= num && num <= 3){
            System.out.printf(" You choosed Number %d\n", num);  //%n=\n  
        } else {
            System.out.println("You got the wrong number.");
        }
    
        }
       

        System.out.println("process end.");



    }
}
