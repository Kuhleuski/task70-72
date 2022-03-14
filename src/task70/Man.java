package task70;

import java.util.Arrays;

public class Man {
    private String name;
    private int age;
    private boolean isMarried;
    private int children;

    public Man(String name, int age, boolean isMarried, int children) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.children = children;
    }
    public Man(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int addChildren(){
        return children++;
    }
    public void work(){
        System.out.println("work");
    }
    public void printInfo(){
        System.out.println("My name is "+ name+", I am "+age+" years old.");
    }
    public static void reflection(){
        System.out.println("Имя класса: " + Man.class.getSimpleName());

        if (Man.class.getDeclaredFields().length != 0){
            System.out.println("Поля: " + Arrays.stream(Man.class.getDeclaredFields()).map((p) -> p.getName()).reduce((p1, p2) -> p1 + ", " + p2).get());
        }
        if (Man.class.getDeclaredMethods().length != 0){
            System.out.println("Методы: " + Arrays.stream(Man.class.getDeclaredMethods()).map((p) -> p.getName()).reduce((p1, p2) -> p1 + ", " + p2).get());
        }
    }
}
