package morejava.Wednesday;

public class Exercise7 {
    
    static void loopbuzz(int num){
        for(int i = 1; i <= num; i++){
            if(i % 5 == 0 && i % 3 == 0)
                System.out.println(i + ": FizzBuzz!");
            
            else if(i % 5 == 0)
                System.out.println(i + ": Fizz!");
            else if(i % 3 == 0)
                System.out.println(i + ": Buzz!");
            else{
                System.out.println(i + ": ");
            }
        }
    }


    public static void main(String[] args) {
        int num = 30;
        loopbuzz(num);
    }
}