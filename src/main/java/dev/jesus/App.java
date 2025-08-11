package dev.jesus;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        TimesTableCreator timesTableCreator = new TimesTableCreator(3);

        System.out.println("Hello World!");

        System.out.println(timesTableCreator.createTimesTable().get(1));
    }
}
