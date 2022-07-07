public class day5_4 {
    public static void main(String[] args) {
        
        char[] abc = { 'A', 'B', 'C', 'D'};
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc); //abc배열 출력
        System.out.println(num); //num배열 출력

        //배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
        char[]  result = new char[abc.length+num.length]; //4+10
        System.arraycopy(abc, 0, result, 0, abc.length); //abc의 0부터 result의 0까지, abc배열. 이동하는식.
        System.arraycopy(num, 0, result, abc.length, num.length);//num의 0부터 result의 0까지, num배열. 이동하는식.
        System.out.println(result);

        //배열 abc를 배열num의 첫번재 위치부터 배열 abc의 길이만큼 복사
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        //number의 인덱스 6위치에 3개를 복사.
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}
