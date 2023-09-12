import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[10];
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < 10; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int result = number % 42;
            numbers[i] = result;
        }

        for(int i : numbers){
            set.add(i);
        }
        bw.write(set.size() + "");

        bw.flush();
        bw.close();
        br.close();
    }
}