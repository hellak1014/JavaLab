package day4;

public class day4_18 {
    public static void main(String[] args) {
        Loop1 : for(int i=2; i<=9; i++) {
            for(int j=i; j<=9; j++) {
                if(j==5)
                    break Loop1;
                    break;
                    continue Loop1;
                    continue;
                System.out.println(i+"*"+j +"="+ i*j);
            }
            System.out.println(); //break; 의 도착점
        }
    }
}


//문제가 안보여서 여기선 못하겟다 수정해오겟습니다...........