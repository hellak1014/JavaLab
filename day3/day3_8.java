package day3;
public class day3_8 {
    public static void main(String[] args) {
        
        for(int i = 2; i <= 9; i++) {
            for (int j = 1; j<=9; j++) {
                System.out.printf("%d X %d = %d%n", i,j,i*j);   //%d는 자리표시자. 정수 1개.

                //printf코드는 서식을 맞추는 포맷. %d X %d = %d%n (정수 * 정수 = 정수(줄바꿈)), 이후 i,j,i*j가 각 자리에 들어간다. 
            }
        }    
    }
}  //과제. 변수 자료형 코드를 쳐볼것. 대입연산까지. 조건문 if까지 했음. 3장 4장 모든 코드 입력해보기. 
