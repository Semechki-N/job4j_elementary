package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60; /* формула перевода рублей в доллары. */

    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(150);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("150 rubles are " + dollar + " dollars");
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float inputDollar = 180;
        float expectedResult = 3;
        float outputDollar = Converter.rubleToDollar(inputDollar);
        boolean passedDollar = expectedResult == outputDollar;
        System.out.println("120 rubles are 2. Test result : " + passedDollar);
    }
}
