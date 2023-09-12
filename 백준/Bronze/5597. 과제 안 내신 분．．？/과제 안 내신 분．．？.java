import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] maxStudents = new boolean[30];
        int[] students = new int[28];

        // 과제를 낸 학생 번호 부여
        for(int i = 0; i < students.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            students[i] = student;
            maxStudents[student - 1] = true;
        }

        for(int i = 0; i < maxStudents.length; i++){
            if(maxStudents[i] == false){
                bw.write(i + 1 + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}