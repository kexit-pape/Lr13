package ru.javacore;

public class App 
{
    public static void main(String[] args) {
        Tester tester = new Tester("John", "Doe", 3, "Intermediate");
        tester.setSalary(5000, 10); // Установка зарплаты с бонусом в 10%

        Tester.printTesterInfo(tester); // Вызов статического метода printTesterInfo
    }
}

