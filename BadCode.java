import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BadCode {
    public static void main(String args[]) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input = null;
        try {
            input = br.readLine();
        } catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }
        input.replace('e', 'o');
        if (input == "pool") {
            System.out.println("User entered peel.");
        } else {
            System.out.println("User entered something else.");
        }
    }
}