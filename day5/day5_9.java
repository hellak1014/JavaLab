import java.util.*;

public class day5_9 {
    public static void main(String[] args) {
        
        int[] numArr = new int[10];
        int[] counter = new int[10];

        Random random = new Random();

        for (int i = 0; i < numArr.length ; i++){
            numArr[i] = random.nextInt(10); 
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int j = 0; j <counter.length; j++) {
            counter[numArr[j]]++;
        }
        /* if 0234589119
         * numArr 0 234589119
         * j = 0 numArr[0] counter[0]++
         * j = 1 numArr[1] counter[2]++
         * j = 2 numArr[2] counter[3]++
         * j = 3 numArr[3] counter[4]++
         *    (중간생략)
         * j = 6 numArr[6] counter[9]++
         *    (중간생략)
         * j = 9 numArr[9] counter[9]++
         */
            
        for (int i=0; i<counter.length;i++) {

        }


        }
        



        }
    //tlqkf 답지 좀 적자 왜이렇게 짤리 넘어가

