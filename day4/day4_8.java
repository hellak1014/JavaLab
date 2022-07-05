package day4;

public class day4_8 {
    public static void main(String[] args) {
        
        int i = 5; //초기화 start

        while(--i!=0) { // 조건과 종료 stop step
            System.out.println(i + " - I can do it.");
        }
    }
}

//--i(전위형)와 i--(후위형)는 다르게 동작한다. i--는 0도 나오고 --i는 0이 안나옴. 
