import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        BufferedWriter bw = new BufferedWriter(
            new OutputStreamWriter(System.out)
        );

        // 첫 번째 숫자 N 입력
        int n = Integer.parseInt(br.readLine());

        // N개의 정수 저장
         HashSet<Integer> nums = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        // 두 번째 숫자 M 입력
        int m = Integer.parseInt(br.readLine());

        // 확인해야 할 M개의 숫자 입력
        st = new StringTokenizer(br.readLine());
        

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            int result = 0;

            if (nums.contains(target))
            {
                result = 1;
            }
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}