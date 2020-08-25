package morejava.Tuesday;

import java.util.Scanner;

public class Exercise2 {
    

    static void multiplesOf(int iInput){
        for(int i= 1; i < iInput; i++){
            if(iInput % i == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iInput = input.nextInt();

        multiplesOf(iInput);
        
    }
}