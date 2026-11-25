import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, Integer> result = new HashMap<>();

        String a = br.readLine().toUpperCase();


        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }

    
        int max = 0;
        
        for (char ch:result.keySet()){
           if (result.get(ch) > max){
               max = result.get(ch);
            }
        }

        
        
        List<Character> letters = new ArrayList<>();
        for (char ch : result.keySet()) {
    if (result.get(ch) == max) {
        letters.add(ch);
    }
}

if (letters.size() == 1) {
    bw.write(letters.get(0));
} else {
    bw.write("?");
}
 
        
       


        bw.flush();
        bw.close();
        br.close();
    }
}
