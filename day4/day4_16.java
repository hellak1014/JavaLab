package day4;

public class day4_16 {
    public static void main(String[] args) {
        for(int i=0; i<= 10;i++) {
            if (i%3==0)
                continue; //건너뛴다
            System.out.println(i);
        }
    }
}
//for보다는 while이 잘 어울림. 
//왜냐면 while은 정해지지 않았기 때문에 제외나 중단이 더 잘맞는다.
//중단과 건너뛰는 코드는 이름을 붙일수있다.