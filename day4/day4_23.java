package day4;
import java.util.Scanner;
public class day4_23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
            System.out.println("number A:"); int a = scanner.nextInt();
            System.out.println("number:B:"); int b = scanner.nextInt();

            if (a > b) { //a가 b보다 크면
                int t = a; //두 값을 교환한다.
                a = b;
                b = t;
            }

            do {
                System.out.print(a + "  ");
                a = a + 1;
            } while (a <= b);
            System.out.println();
            
        }

            
}
       
        //보고 너도 해봐...............

        

   
        
