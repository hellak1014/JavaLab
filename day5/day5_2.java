

import java.util.*;
public class day5_2 {
    public static void main(String[] args) {
        
        int[] iArr1 = new int[10]; //배열1번 10개
        int[] iArr2 = new int[10]; //배열1번 10개
      //  int[] iArr3 = new int[] {100, 95, 80, 70, 60};. new int []는 생략가능. 
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'}; //글자 배열

    for (int i=0; i < iArr1.length ; i++) {
        iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다
    }

    for (int i=0; i < iArr2.length; i++) {
        iArr2[i] = (int)(Math.random()*10) + 1; //1~10의 값을 갯수만 맞춰서 배열에 저장
    }
        //배열에 저장된 값을 출력한다.

    for(int i=0; i < iArr1.length; i++) {
        System.out.print(iArr1[i]+","); 
    }

    System.out.println(); //1번 배열의 숫자들을 ,을 넣어서 출력
    System.out.println(Arrays.toString(iArr2)); //2번 배열의 숫자들을 출력
    System.out.println(Arrays.toString(iArr3)); // 3번 배열 숫자 출력
    System.out.println(Arrays.toString(chArr)); // 글자배열 출력
    System.out.println(iArr3); //이거 왜 랜덤값이지 -> 배열 출력은 for문을 사용하거나 아니면 Arrays.toString을 이용해야 한다. 랜덤값이 나오는 이유는 저 배열의 주소지를 이야기 하고 있어서.
    System.out.println(chArr);//글자배열 출력

    }
}
