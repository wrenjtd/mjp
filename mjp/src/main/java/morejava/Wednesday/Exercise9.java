package morejava.Wednesday;

public class Exercise9 {
 
    static void primes(int value){
        int counter;
        for(int i = 2; i <= value; i++){
            counter = 0;
            for(int j = 1; j<=i; j++){
                if(i % j == 0){
                    counter++;
                }
            }
            if(counter==2){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        
        int value = 50;

        primes(value);
    }
}