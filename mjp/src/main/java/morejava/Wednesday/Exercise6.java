package morejava.Wednesday;

public class Exercise6 {
    
    static void reverse(String word){

        StringBuilder sb = new StringBuilder();
        for(int i = word.length()-1; i >= 0; i--){
            sb.append(word.charAt(i));
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String word = "halloween";

        reverse(word);
    }
}