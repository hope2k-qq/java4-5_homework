package com.company.task6;

import java.util.Scanner;

public class Car {
    private String carName;
    private String manufacturer;
    private int year;
    private double engineCapacity;

    public Car() {
        carName = "";
        manufacturer = "";
        year = 0;
        engineCapacity = 0.0;
    }

    public Car(String carName, String manufacturer, int year, double engineCapacity) {
        this.carName = carName;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public void inputCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car name: ");
        while (true) {
            carName = scanner.nextLine();
            if (carName.length() >= 2) {
                break;
            } else {
                System.out.println("Error, car name must contain at least 2 characters.");
            }
        }
        System.out.print("Enter manufacturer: ");
        while (true) {
            manufacturer = scanner.nextLine();
            if (manufacturer.length() >= 2) {
                break;
            } else {
                System.out.println("Error, manufacturer must contain at least 2 characters.");
            }
        }
        while(true) {
            try {
                System.out.print("Enter year: ");
                year = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error, enter correct data!");
                scanner.nextLine();
            }
        }
        while(true) {
            try {
                System.out.print("Enter engine capacity: ");
                engineCapacity = scanner.nextDouble();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error, enter correct data!");
                scanner.nextLine();
            }
        }
    }

    public void showCar() {
        System.out.println("Car name: " + carName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Engine capacity: " + engineCapacity);
    }

    public String getCarName() {
        return carName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }


    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
