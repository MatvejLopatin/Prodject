import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numberToGuess = (int) (Math.random() * 100); // Генерируем случайное число от 0 до 100
            int guess;
            
            System.out.println("Добро пожаловать в игру 'Угадай число'!");
            
            do {
                System.out.print("Введите ваше предположение: ");
                guess = scanner.nextInt();
                
                if (guess < numberToGuess) {
                    System.out.println("Загаданное число больше.");
                } else if (guess > numberToGuess) {
                    System.out.println("Загаданное число меньше.");
                }
            } while (guess != numberToGuess);
            
            System.out.println("Поздравляем! Вы угадали число " + numberToGuess + "!");
        }
    }
}
