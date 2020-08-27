package morejava.Wednesday;

public class Exercise8 {

    static void fibseq(int num) {

        if (num == 0)
            System.out.println(0);

        int a = 0;
        int b = 1;

        for (int i = 2; i < num; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        int num = 7;
        for(int i = 0; i < num; i++){
            fibseq(i);
        }
        

    }
}