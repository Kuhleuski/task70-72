package task70;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        /**
         * Задание 70
         * Создать класс Man c произвольным набором
         * полей и методов
         * (не менее 3)
         * Создать метод, который распечатает информацию о классе
         * с помощью рефлексии. Вызвать метод с помощью
         * рефлексии из основной программы.
         * */

        try {
            Method m = Man.class.getDeclaredMethod("reflection");
            m.setAccessible(true);
            m.invoke(null);
        } catch (NoSuchMethodException | IllegalArgumentException | InvocationTargetException | IllegalAccessException e){
            e.printStackTrace();
        }

    }
}
