package morejava.Tuesday;

import java.util.HashMap;
import java.util.Map;

class hmCount {
    int counter;
    int index;

    public hmCount(int index) {
        this.index = index;
        this.counter = 1;
    }

    void count() {
        this.counter++;
    }
}

public class Exercise4 {

    static String nonrepeat(String word) {
        HashMap<Character, hmCount> hMap = new HashMap<>();
        String value = "";
        
        for (int i = 0; i < word.length(); i++) {

            if (hMap.containsKey(word.charAt(i))) {
                hMap.get(word.charAt(i)).count();
            } else {
               
                hMap.put(word.charAt(i), new hmCount(i));
            }
        }


        for (Map.Entry<Character, hmCount> letter : hMap.entrySet()) {
            if (letter.getValue().counter == 1) {
                value = letter.getKey().toString();
                
            }
        }

        return value;
    }

    public static void main(String[] args) {
        String word = "adzbdcab";

        System.out.println(nonrepeat(word));
    }
}