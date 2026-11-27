import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        List<Integer> nums = new ArrayList<>();
        
        for (int i = 0; i < N; i++){
            nums.add(Integer.parseInt(br.readLine()));
        }
        
        nums.sort(Comparator.naturalOrder());
        
        for (int i = 0; i < nums.size(); i++){
             bw.write(String.valueOf(nums.get(i)));
             bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
        
        
    }
}