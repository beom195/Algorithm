import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = 9;
        int[] numbers = new int[A];
        int count = 0;
        int index = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < A; i++){
            int B = Integer.parseInt(br.readLine());
            numbers[i] = B;
            count++;
            if(max < numbers[i]){
                max = numbers[i];
                index = count;
            }

        }
        bw.write(max + "\n");
        bw.write(index + "");


        bw.flush();
        bw.close();
        br.close();
    }
}
