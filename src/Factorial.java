import com.allmycode.dummiesframe.DummiesFrame;

import java.math.BigInteger;

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

    public static String calculate(long factorial) {
        long total = 1;

        if (factorial != 0) {

            for (int i = 1; i <= factorial; i++) {
                total *= i;
            }
        }
        return "Значением факториала " + factorial + "! " + "является число " + total;
    }
}
