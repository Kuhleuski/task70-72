package task71;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * Создайте класс с методов printHelloWorld(). Вызвать метод с помощью
 * рефлексии из основной программы.
 * */
public class Main {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        try {
            Method m = helloWorld.getClass().getDeclaredMethod("printHelloWorld");
            m.setAccessible(true);
            m.invoke(helloWorld);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }
    }
}
