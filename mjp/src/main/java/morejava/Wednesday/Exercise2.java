package morejava.Wednesday;

import java.util.HashMap;

class mCount{
    int counter;
    int index;

    public mCount(int index){
        this.index = index;
        this.counter = 1;
    }

    void count(){
        counter++;
    }
}

public class Exercise2 {
   
    static void appearance(String word, int subArray){
        
        HashMap<Character, mCount> wordmap = new HashMap<>();

       for(int i = 0; i < word.length(); i++){
           if(wordmap.containsKey(word.charAt(i))){
               wordmap.get(word.charAt(i)).count();
           }
           else{
               wordmap.put(word.charAt(i), new mCount(i));
           }
       }

       System.out.println(wordmap.get(word.charAt(subArray)).counter);

    }
    


    public static void main(String[] args) {
        String word = "Apple";
        int subArray = 2;

        appearance(word, subArray);
    }
}