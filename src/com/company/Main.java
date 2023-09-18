package com.company;

import com.company.task1.Human;
import com.company.task2.City;
import com.company.task3.Country;
import com.company.task4.Fraction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        System.out.println("\nTask1 - 1\nTask2 - 2\nTask3 - 3\nTask4 - 4\n");
        System.out.print("Enter value: ");
        try{
            value = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error!");
        }
        switch (value){
            case 1:
                System.out.println("Task 1");
                Human human = new Human();
                human.inputHuman();
                System.out.println("\nData human:");
                human.showDataHuman();
                break;
            case 2:
                System.out.println("Task 2");
                City city = new City();
                city.inputCity();
                System.out.println("\nData city:");
                city.showDataCity();
                break;
            case 3:
                System.out.println("Task 3");
                Country country = new Country();
                country.inputCountry();
                System.out.println("\nData country:");
                country.showDataCountry();
                break;
            case 4:
                Fraction fraction1 = new Fraction();
                Fraction fraction2 = new Fraction();
                Fraction result;

                System.out.println("Enter first fraction:");
                fraction1.inputFraction();

                System.out.println("Enter second fraction:");
                fraction2.inputFraction();

                int value2 = 0;
                System.out.println("\nAddition - 1\nSubtraction - 2\nMultiplication - 3\nDivision - 4\n");
                System.out.print("Enter value: ");
                try{
                    value2 = scanner.nextInt();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Error!");
                }
                switch(value2){
                    case 1:
                        result = fraction1.addition(fraction2);
                        System.out.print("Result: ");
                        result.showFraction();
                        break;
                    case 2:
                        result = fraction1.subtraction(fraction2);
                        System.out.print("Result: ");
                        result.showFraction();
                        break;
                    case 3:
                        result = fraction1.multiplication(fraction2);
                        System.out.print("Result: ");
                        result.showFraction();
                        break;
                    case 4:
                        result = fraction1.division(fraction2);
                        System.out.print("Result: ");
                        result.showFraction();
                        break;
                    default:
                        System.out.println("Error, enter the correct value!");
                        return;
                }
                break;
            default:
                System.out.println("Error, enter the correct value!");
                return;
        }


    }
}
