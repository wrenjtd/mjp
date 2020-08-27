package morejava.Thursday;

public class Exercise1 {
    
    static void prime(int num){
        int counter;

        for(int i = 2; i <= num; i++){
            counter =0;
            for(int j = 1; j <= i; j++){
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
        int num = 78;
        prime(num);
    }
}