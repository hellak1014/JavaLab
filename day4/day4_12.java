package day4;

import java.util.*;

public class day4_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("합계를 구할 숫자 입력.(끝내려면 0)");

        int num;

        int sum = 0;

        while(true) {
            System.out.println(">> ");
            num = scanner.nextInt();

            if (num != 0) {
                 sum += num;//0이 아니면 무한반복
           } else {  //0을 입력한 경우
                break;
           }
           
        }

         System.out.println(sum);  
    
        }
    }

