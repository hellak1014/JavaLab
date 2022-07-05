package day4;

import javax.print.attribute.SupportedValuesAttribute;

public class day4_11 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while((sum += ++i) <= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }

        }
    }

