import java.util.Scanner;

public class hjgjg {

    public static void main(String[] args){
        
        Boolean a = true;
        
        Boolean what_is_player = true;
        
        int input;
        
        String arr[] = new String[] {"0", "0", "0", "0", "0", "0", "0", "0", "0"};
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Добро пожаловать в игру \"крестики нолики\"\nНапишите \"начать\" если хотите начать");

            while (!scanner.next().toLowerCase().equals("начать")) {
                System.out.println("Напишите \"начать\" если хотите начать");
            }
                
                for (;;) {
                    
                    if (arr[0] == "X" && arr[1] == "X" && arr[2] == "X" || 
                        arr[3] == "X" && arr[4] == "X" && arr[5] == "X" || 
                        arr[6] == "X" && arr[7] == "X" && arr[8] == "X" || 
                    
                        arr[0] == "X" && arr[3] == "X" && arr[6] == "X" || 
                        arr[1] == "X" && arr[4] == "X" && arr[7] == "X" || 
                        arr[2] == "X" && arr[5] == "X" && arr[8] == "X" || 
                    
                        arr[0] == "X" && arr[4] == "X" && arr[8] == "X" || 
                        arr[6] == "X" && arr[4] == "X" && arr[2] == "X") {

                            System.out.println("X Победил!");
                            break;

                    }

                    
                    if (arr[0] == "O" && arr[1] == "O" && arr[2] == "O" || 
                        arr[3] == "O" && arr[4] == "O" && arr[5] == "O" || 
                        arr[6] == "O" && arr[7] == "O" && arr[8] == "O" || 
                    
                        arr[0] == "O" && arr[3] == "O" && arr[6] == "O" || 
                        arr[1] == "O" && arr[4] == "O" && arr[7] == "O" || 
                        arr[2] == "O" && arr[5] == "O" && arr[8] == "O" || 
                    
                        arr[0] == "O" && arr[4] == "O" && arr[8] == "O" || 
                        arr[6] == "O" && arr[4] == "O" && arr[2] == "O") {

                            System.out.println("O Победил!");
                            break;

                    }
                    

                    if (what_is_player){
                        System.out.println("Ход: X");
                        what_is_player = false;
                    } else {
                        System.out.println("Ход: O");
                        what_is_player = true;
                    }
                    
                    System.out.print(arr[0]);
                    System.out.print(arr[1]);
                    System.out.println(arr[2]);
                    System.out.print(arr[3]);
                    System.out.print(arr[4]);
                    System.out.println(arr[5]);
                    System.out.print(arr[6]);
                    System.out.print(arr[7]);
                    System.out.println(arr[8]);

                    two: for (;;) {

                        input = scanner.nextInt();

                        if (arr[input - 1] == "X" || arr[input - 1] == "O") {
                            System.out.println("Эта позиция уже занята!");
                            a = false;
                        } else {
                            a = true;
                        }

                        if (a) {
                            
                            if (!what_is_player) {
                                arr[input - 1] = "X";
                                break two;
                            } else {
                                arr[input - 1] = "O";
                                break two;
                            }
                        }  
                    
                    }
                    
            }
        }

    }

}