package morejava.Wednesday;

import java.util.Scanner;

public class Exercise3 {
    

    static void multiples(int passedNum){
        for(int i = 1; i <= passedNum; i++){
            if(passedNum % i == 0){
                System.out.println(i);
            }
        }
    }



    public static void main(String[] args) {
        
        Scanner scanned = new Scanner(System.in);
        int passedNum = scanned.nextInt();
        multiples(passedNum);
        scanned.close();
    }
}