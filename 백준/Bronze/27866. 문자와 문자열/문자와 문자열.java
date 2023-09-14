import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int i = Integer.parseInt(br.readLine());

        char charAt = str.charAt(i - 1);
        bw.write(charAt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}