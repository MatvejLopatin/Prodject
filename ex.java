import java.util.Arrays;

public class ex {
    public static void main(String[] args) {

        String arr[][] = new String[][] {{"a1", "a2", "a3", "a4", "a5", "a6"},
                                        {"a1", "a2", "a3", "a4", "a5", "a6"},
                                        {"a1", "a2", "a3", "a4", "a5", "a6"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
    }
}