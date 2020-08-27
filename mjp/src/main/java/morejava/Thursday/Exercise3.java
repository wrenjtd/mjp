package morejava.Thursday;

public class Exercise3 {
   
    static void multiplesOf(int num){
        
        for(int i = 1; i<=num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
    

    public static void main(String[] args) {
        int num = 100;

        multiplesOf(num);
    }
}