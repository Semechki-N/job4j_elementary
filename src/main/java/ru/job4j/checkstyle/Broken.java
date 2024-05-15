package ru.job4j.checkstyle;

public class Broken {
    private final int size = 10;
    private static final String NEW_VALUE = "";
    private String surname;
    private String name;

    public Broken(int size, String surname, String name) {
        this.name = name;
        this.surname = surname;
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int age, int weight, int height) {
    }
}
