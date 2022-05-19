import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        //создаем новый список для хранения отобранных значений
        List<Integer> newList = new ArrayList<>();

        //берем положительные четные значения и добавляем в список
        for (int number : intList) {
            if (number > 0 && number % 2 == 0) {
                newList.add(number);
            }
        }
        //Сортируем
        Collections.sort(newList);
        //выводим на экран
        System.out.println(newList);
    }
}
