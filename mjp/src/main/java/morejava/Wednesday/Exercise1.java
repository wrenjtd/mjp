package morejava.Wednesday;


public class Exercise1 {
    
    static char [] addarrays(char [] cArray1, char [] cArray2){
        int total = 0;
        StringBuilder fBuilder = new StringBuilder();
        String fString = "";
        StringBuilder sBuilder = new StringBuilder();
        String sString = "";

        for(int i = 0; i < cArray1.length; i++){
            fBuilder.append(cArray1[i]);
        }
        for(int i = 0; i < cArray2.length; i++){
            sBuilder.append(cArray2[i]);
        }
        
        fString = fBuilder.toString();
        sString = sBuilder.toString();
        total = Integer.parseInt(fString) + Integer.parseInt(sString);

        String sTotal = Integer.toString(total);
        
        return sTotal.toCharArray();
    }

    public static void main(String[] args) {
        
        char [] cArray1 = {'3', '5', '9'};
        char [] cArray2 = {'1', '2', '8', '4'};
        System.out.println(addarrays(cArray1, cArray2));
        
    }
}