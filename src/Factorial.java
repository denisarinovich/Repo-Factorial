import java.util.Scanner;
import static java.lang.System.*;

public class Factorial {

    public static void main(String args[]) {

        int factorial = 1;
        int total;

        Scanner keyboard = new Scanner(System.in);

        while (factorial != 0) {
            total = 1;
            System.out.println();
            System.out.println("Для закрытия программы введите 0.");
            out.print("Введите факториал: ");
            factorial = keyboard.nextInt();

            if (factorial != 0) {
                for (int i = 1; i <= factorial; i++) {
                    total *= i;
                }
                System.out.println("Значением факториала " + factorial + "! " + "является число " + total + ".");
                System.out.println();

            } else {
                System.out.println("Выполнение программы завершено! Спасибо!");
                keyboard.close();
            }
        }
    }
}