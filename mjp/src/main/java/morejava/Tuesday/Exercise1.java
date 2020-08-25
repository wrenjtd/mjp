package morejava.Tuesday;

import java.util.Scanner;

public class Exercise1 {
   
    static void fizzBuzz(int passedNum){

        if(passedNum % 5 == 0 && passedNum % 3 == 0){
            System.out.println("FizzBuzz!");
        }
        else if(passedNum % 5 == 0){
            System.out.println("Fizz!");
        }
        else if(passedNum % 3 == 0){
            System.out.println("Buzz!");
        }
        else{
            System.out.println("Burp beep boop " + passedNum + " doesn't create FizzBuzz!");
        }
    }
    
    public static void main(String[] args) {
        


        System.out.println("Enter the number for fizzBuzz: \n");
        Scanner input = new Scanner(System.in);
        int passedNum = input.nextInt();

        fizzBuzz(passedNum);
    }
}