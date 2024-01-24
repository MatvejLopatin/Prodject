import java.util.Scanner;

public class opros {
    public static void func(String vopros, String otvet) {
        
        try (Scanner scann = new Scanner(System.in)) {
            System.out.println(vopros);
            
            String sc = scann.next();
            
            if (sc.toLowerCase().equals(otvet)) /* проверка строк */ {
                System.out.println("верно!");
            }
            else {
                System.out.println("неверно!");
            }
        }
    }

    public static void main(String[] args) {
        func("Земля круглая?", "да");
    }

}
