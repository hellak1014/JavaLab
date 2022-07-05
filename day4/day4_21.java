package day4;
import java.util.Scanner;
public class day4_21 {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
     int i;
   
        while(true) {
            System.out.println("number?");  
            i = scanner.nextInt();
                if (100<=i && i<=999) {
                    System.out.println("number is" + i);
                    break;
                   }
                   System.out.println("your number is " + i);
                }  
        } 



    }

