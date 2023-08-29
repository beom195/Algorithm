import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] dice =br.readLine().split(" ");

        int d1 = Integer.parseInt(dice[0]);
        int d2 = Integer.parseInt(dice[1]);
        int d3 = Integer.parseInt(dice[2]);

        if(d1 == d2 && d1 == d3){
            System.out.println(10000 +(d1 * 1000));
        } else if (d1 == d2 || d1 == d3 || d2 == d3) {
            //5 5 6
            if(d1 == d2 || d1 == d3){
                System.out.println(1000 + (d1 * 100));
            }else if (d2 == d3){
                System.out.println(1000 + (d2 * 100));
            }
        }else{
            if(d1 > d2 && d1 > d3){
                System.out.println(d1 * 100);
            } else if (d2 > d1 && d2 > d3) {
                System.out.println(d2 * 100);
            } else if (d3 > d1 && d3 > d1) {
                System.out.println(d3 * 100);
            }
        }

        br.close();
    }
}
