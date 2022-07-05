package day4;

public class day4_14 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++) {
            System.out.printf("i=%d ", i);
            
            int tmp = i;

            do {
                if(tmp%10%3==0 && tmp%10!=0) //tmp%10이 3의 배수인지 확인 (0제외)
                    System.out.print("clap"); 
            } while((tmp/=10)!=0); //tmp/= 10은 tmp = tmp /10과 동일하다.
            System.out.println();
        }
    }
}
