package morejava.Tuesday;

import java.util.Scanner;

public class Exercise5 {
    
    static void countby(int num){

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        countby(num);
    }
}