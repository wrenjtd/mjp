package morejava.Wednesday;

public class Exercise9 {
 
    static void primes(int value){
        int counter = 0;
        for(int i = 1; i <= value; i++){
            if(value % i ==0){
                counter++;
            }
            if(counter == 2){
                System.out.println(i);
            }
        }


    }

    public static void main(String[] args) {
        
        int value = 50;

        primes(value);
    }
}