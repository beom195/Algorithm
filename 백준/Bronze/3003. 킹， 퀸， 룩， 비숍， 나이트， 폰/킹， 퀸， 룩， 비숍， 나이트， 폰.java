import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chess = new int[]{1,1,2,2,2,8};
        int[] numbers = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());

            if(chess[i] != numbers[i]){
                numbers[i] = chess[i] - numbers[i];
            } else if (chess[i] == numbers[i]) {
                numbers[i] = 0;
            }
            bw.write(numbers[i] + " ");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}