import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int max = 2 * N -1;
        int num = 1;

        for(int i = 0; i < N; i++){
            for(int j = N-1; j > i; j--){
                bw.write(" ");
            }
            for(int k = 0; k < num; k++){
                bw.write("*");
            }
            num = num + 2;
            bw.newLine();
        }

        for(int i = 1; i < N; i++){
            for(int j = 0; j < i; j++){
                bw.write(" ");
            }
            for(int k = max - 2; k > 0; k--){
                bw.write("*");
            }
            max = max - 2;
            bw.newLine();
        }



        bw.flush();
        bw.close();
        br.close();
    }
}