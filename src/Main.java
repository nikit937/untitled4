import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int compNumber = random();
        int humNumber = scan();
        if (humNumber == 999){
            while (humNumber>compNumber){
                System.out.println("CHEAT");
                humNumber--;
            }
        }
        if (humNumber == compNumber) {
            System.out.println("Вы выиграли");
        }else   {
            System.out.println("Вы проиграли");
        }
    }

    public static int random() {
        Random newRandom = new Random();
        int randoNumber = newRandom.nextInt(11) + 1;
        return randoNumber;
    }

    public static int scan(){
        System.out.println("Введите число от 1 до 10");
        Scanner scanner = new Scanner(System.in);
        int humanNumber = scanner.nextInt();
        return humanNumber;
    }
}

