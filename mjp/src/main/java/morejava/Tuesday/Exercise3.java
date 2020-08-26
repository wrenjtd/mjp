package morejava.Tuesday;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
    
    static int tensAmount = 0, fivesAmount = 0, onesAmount = 0;
    static void getChange(double insertedCash, double price){       
        
        
        if(insertedCash > 20.00){
            System.out.println("Sorry, feature to appear in next update.\n\n");
            System.out.println("You were given back your money.");
        }
        else{
            double change = insertedCash - price ;

            if(change >= 10.00 && change <= 20.00){
                tensAmount = (int) change / 10;
                change -= tensAmount * 10;
                getChange(change, 0);
            }
            else if(change >= 5.00 && change < 10.00){
                fivesAmount = (int) change / 5;
                change -= fivesAmount * 5;
                getChange(change, 0);
            }
            else if(change >= 1.00 && change <= 4.00){
                    onesAmount = (int) change / 1;
                    change -= onesAmount * 1;
                    getChange(change, 0);
            }
            else if (change < 1.00 ){
                int paymentToInt = (int)(change *100);
                            
                int quartersAmount = Math.floorDiv(paymentToInt, 25); 
                paymentToInt -= quartersAmount * 25;
                int dimesAmount = Math.floorDiv(paymentToInt, 10);
                paymentToInt -= dimesAmount * 10;
                int nicklesAmount = Math.floorDiv(paymentToInt, 5); 
                paymentToInt -= nicklesAmount * 5;
                int penniesAmount = Math.floorDiv(paymentToInt, 1);
                paymentToInt -= penniesAmount * 1;

                System.out.println("Your change: ");
                if(tensAmount != 0){
                    System.out.println("$10 bills: " + tensAmount);
                }
                if(fivesAmount != 0){
                    System.out.println("$5 bills: " + fivesAmount);

                }
                if(onesAmount != 0){
                    System.out.println("$1 bills: " + onesAmount);

                }
                
                System.out.println("Quarters: " + quartersAmount + "\nDimes: " + quartersAmount + "\nNickles:" + nicklesAmount + "\nPennies:" + penniesAmount);
                System.out.println("Thank you for shopping");
                
                
                
            }

            
            
    
            
            }
        }
    

    public static void main(String[] args) {
        
        double itemPrice = 4.92;
        System.out.println("The price is " + itemPrice + ". Please insert cash no larger than $20.00");
        Scanner scanned = new Scanner(System.in);
        double insertedCash = scanned.nextDouble();
        
        getChange(insertedCash, itemPrice);
        
    }
}