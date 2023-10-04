package com.company.task4;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            System.out.println("The denominator cannot be zero!");
            this.numerator = 0;
            this.denominator = 1;
        }
    }

    public void inputFraction() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            numerator = scanner.nextInt();

            while (true) {
                System.out.print("Enter denominator (!=0): ");
                denominator = scanner.nextInt();
                if (denominator != 0){
                    break;
                } else {
                    System.out.println("The denominator cannot be zero!");
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error, only digits!");
            inputFraction();
        }

    }

    public void showFraction() {
        System.out.println("Fraction: " + numerator + "/" + denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }


    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("The denominator cannot be zero!");
        }
    }

    public Fraction addition(Fraction secondFraction) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * secondFraction.denominator + secondFraction.numerator * this.denominator;
        result.denominator = this.denominator * secondFraction.denominator;
        return result;
    }

    public Fraction subtraction(Fraction secondFraction) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * secondFraction.denominator - secondFraction.numerator * this.denominator;
        result.denominator = this.denominator * secondFraction.denominator;
        return result;
    }

    public Fraction multiplication(Fraction secondFraction) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * secondFraction.numerator;
        result.denominator = this.denominator * secondFraction.denominator;
        return result;
    }

    public Fraction division(Fraction secondFraction) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * secondFraction.denominator;
        result.denominator = this.denominator * secondFraction.numerator;
        return result;
    }
}
