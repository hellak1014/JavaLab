public class day5_5 {
    public static void main(String[] args) {
        
        int sum =0;
        int [] score = {100, 88, 100, 100, 90};

       for(int i=0; i < score.length; i++) {
            sum += score[i]; //더하는것
       }

       System.out.println("all : " + sum);
       System.out.println("average : " + (sum / (float)score.length));
        

       //배열의 갯수를 표현할때는 무조건 score.length사용. 
       //배열 요소들을 불러올때는 for(int i=0; i < (배열이름).length; i++) 사용

    }
}
