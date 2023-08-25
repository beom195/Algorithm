import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id;
        String newId;
        String msg ="??!";

        newId = scanner.nextLine();
        id = newId;
        if(id.equals(newId) && id.length() <= 50){
            System.out.println(id+msg);
        }

    }
}
