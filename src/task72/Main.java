package task72;


import java.lang.reflect.Method;

/**
 * Создать собственную аннотацию @AcademyInfo c полем year.
 * Создать метод, помеченный этой анотацией
 * с заданным year и метод без нее.
 * С помощью рефлексии проверить наличие данной
 * аннотации у этих методов из основной программы.
 * */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Методы с аннотацией AcademyInfo: ");
        for (Method item : main.getClass().getDeclaredMethods()){
            if (item.isAnnotationPresent(AcademyInfo.class)){
                System.out.println(item.getName());
            }
        }
    }
    @AcademyInfo(year = 1)
    public static void MethodWithAnnotation() {
        System.out.println("Метод с аннотацией");
    }

    public static void MethodWithoutAnnotation() {
        System.out.println("Метод без аннотации");
    }
}
