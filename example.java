import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class example {
    public static void main(String[] args) throws IOException {
        try (FileWriter file = new FileWriter("txt.txt", true)) {
            try (Scanner scanner = new Scanner(System.in)) {
                String a = scanner.nextLine();
                file.append(String.valueOf(a));
            }
            file.flush();
        }
    }
}
