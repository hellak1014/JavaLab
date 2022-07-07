public class day5_3 {
    public static void main(String[] args) {
        
        int[] arr = new int[5]; //배열 arr에 5개를 저장. 출력값은 0~4.
 
        for(int i=0; i < arr.length; i++)
            arr[i] = i + 1; //출력값 조정을 위해서 +1

        System.out.println("[before]");
        System.out.println("arr.length:"+arr.length); //배열 방갯수. 5개
        for(int i=0; i < arr.length; i++)
            System.out.println("arr["+i+"] :"+arr[i]); //배열0번방 1, 배열 1번방 2, 배열 2번방 3 이런식으로 출력. 

        int[] tmp = new int[arr.length*2];  //tmp배열 생성. 길이는 arr배열의 *2

        // 배열 arr에 저장된 값을 배열 tmp에 복사한다.
        for(int i=0; i < arr.length; i++)
            tmp[i] = arr[i]; //배열값 옮기기

        arr = tmp;

        System.out.println("[after]"); 
        System.out.println("arr.lenght:"+arr.length); //방갯수?
        for(int i=0; i < arr.length; i++)
            System.out.println("arr["+i+"]:"+arr[i]); //배열0번방 1, 배열 1번방 2 ~. 단 5번방부터 데이터가 없으니 0으로 출력.
    }

}
