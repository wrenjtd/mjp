package morejava.Tuesday;

import java.util.Scanner;

public class Exercise6 {

    static void primeNum(int value) {
        int count;
       
            for (int i = 2; i < value; i++) {
                count = 0;
                for (int j = 1; j <= (int) Math.sqrt(value); j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                }
            }
           
        }

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        primeNum(value);
    }
}