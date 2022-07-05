package day4;
import java.util.Scanner;

public class day4_6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("1~n + =? n=");
        int n = scanner.nextInt();

    
            for(int i=n; i>=1; i--) {
            sum += i;
        }
            System.out.printf("The sum of 1 to %d is %d.", n, sum);

    }
   
}

