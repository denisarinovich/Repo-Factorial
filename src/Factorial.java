import com.allmycode.dummiesframe.DummiesFrame;
import static java.lang.System.*;

public class Factorial {

    /*
    Вторая версия программы.
    Задачей данной программы является вычисление введенного пользователем факториала.
    За основу фрейма взят готовый класс DummiesFrame из книги Java for Dummies.
    */

    public static void main(String args[]) {

        DummiesFrame frame = new DummiesFrame("Вычисление значение факториала");
        frame.addRow("Введите значение факториала:");
        frame.setButtonText("Вычислить!");
        frame.go();
    }

    public static String calculate(int factorial) {

        int total = 1;

        if (factorial != 0 && factorial <= 12) {

            for (int i = 1; i <= factorial; i++) {
                total *= i;
            }
        } else if (factorial != 0 && factorial > 12) {
            return "Нехватает памяти переменной int, программа принимает максимальеый факториал 12!";
        }
        return "Значением факториала " + factorial + "! " + "является число " + total;
    }
}
