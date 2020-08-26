package morejava.Wednesday;

public class Exercise4 {

    static int nthfib(int num) {
        
        if(num == 0) return 0;
        else if(num == 1) return 1;
        else{
            return (nthfib(num - 1) + nthfib(num - 2));
        }
    
    }

    public static void main(String[] args) {
        int num = 10;
        for(int i = 0; i < num; i++){
            System.out.println(nthfib(i));
        }
        

    }
}