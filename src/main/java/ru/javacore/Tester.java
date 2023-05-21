package ru.javacore;
public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Конструкторы
    public Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname);
        this.experienceInYears = experienceInYears;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears);
        this.englishLevel = englishLevel;
    }

    // Перегруженные методы
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalary(double salary, double bonus) {
        this.salary = salary + bonus;
    }

    public void setSalary(double salary, int bonusPercentage) {
        double bonus = salary * bonusPercentage / 100.0;
        this.salary = salary + bonus;
    }

    // Статический метод
    public static void printTesterInfo(Tester tester) {
        System.out.println("Name: " + tester.name);
        System.out.println("Surname: " + tester.surname);
        System.out.println("Experience: " + tester.experienceInYears + " years");
        System.out.println("English Level: " + tester.englishLevel);
        System.out.println("Salary: $" + tester.salary);
    }
}
