package day3;
public class day3_9 {
    public static void main(String[] args) {
       
            float f  = 9.12345678901234567890f;
            float f2 = 1.2345678901234567890f;
            double d = 9.12345678901234567890d;
        
            System.out.printf("      123456789012345678901234%n");  // 소수점 이하 6번째 자리까지 출력
            System.out.printf("f : %f%n", f); //f자리에 있는걸 n에 찍어라.
            System.out.printf("f : %24.20f%n", f); //  %24.20f => 전체 24자리 중에서 20자리는 소수점 이하의 수를 출력하라.
            System.out.printf("f2 : %24.20f%n", f2);
            System.out.printf("d : %24.20f%n", d);
          }
        }

