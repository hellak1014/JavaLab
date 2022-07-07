public class day5_7 {
    public static void main(String[] args) {

            
            int[] ball = new int[45]; //ball이라는 배열에 45개를 만든다. 출력가능 숫자 0~44


            for(int i =0; i < ball.length; i++) //출력해야 하는 숫자는 1~45이기 때문에 
                ball[i] = i+1; //나오는 숫자에 +1을 더한다. 

            int temp = 0; 
            int j = 0;
        
            for(int i=0; i < 6; i++){
                j = (int)(Math.random() * 45);
                temp = ball[i];
                ball[i] = ball[j];
                ball[j] = temp; // 여기까지 왜 하는거더라 질문해야해

            }

            for(int i=0; i<6; i++){
                System.out.printf("ball[%d]=%d%n", i, ball[i]); //0번째 뽑은 공은 00, 1번째 뽑은ㅇ 공은 00의 식.
            }

    }
}
