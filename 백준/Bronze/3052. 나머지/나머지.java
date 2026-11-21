import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner s = new Scanner(System.in);
        
        for(int i = 0; i<10; i++) {
            set.add(Integer.parseInt(s.next())%42);
        }
        
        System.out.println(set.size());
    }
    
}

