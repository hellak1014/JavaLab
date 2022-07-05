package day4;

public class day4_2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        //일반 for 문
        // for (int i = 0; i<=4; i++) {
        //     System.out.println(arr[i]);
        // }
        // 배열 구문
        // System.out.println(arr[0]);

        //for each 구문

        for (int i : arr) {     // arr 값자체를 하나씩 던지는 개념. 
            System.out.println(i);
        }
    }
}
