package com.company.task2;

import java.text.ParseException;
import java.util.Scanner;

public class City {
    private String cityName;
    private String region;
    private String country;
    private long population;
    private int postalIndexCity;
    private int phoneCodeCity;

    public City() {
        cityName = "";
        region = "";
        country = "";
        population = 0;
        postalIndexCity = 0;
        phoneCodeCity = 0;
    }

    public void inputCity(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city name: ");
        while (true) {
            cityName = scanner.nextLine();
            if (cityName.length() >= 3) {
                break;
            } else {
                System.out.println("Error, city name must contain at least 3 characters.");
            }
        }

        System.out.print("Enter region: ");
        while (true) {
            region = scanner.nextLine();
            if (region.length() >= 3) {
                break;
            } else {
                System.out.println("Error, region must contain at least 3 characters.");
            }
        }

        System.out.print("Enter country: ");
        while (true) {
            country = scanner.nextLine();
            if (country.length() >= 3) {
                break;
            } else {
                System.out.println("Error, country must contain at least 3 characters.");
            }
        }

        while(true){
            try {
                System.out.print("Enter number of population: ");
                population = scanner.nextLong();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error, enter correct data!");
                scanner.nextLine();
            }
        }

        while(true){
            try {
                System.out.print("Enter city postal index: ");
                postalIndexCity = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error, enter correct data!");
                scanner.nextLine();
            }
        }

        while(true){
            try {
                System.out.print("Enter telephone city code: ");
                phoneCodeCity = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error, enter correct data!");
                scanner.nextLine();
            }
        }
    }

    public void showDataCity(){
        System.out.println("City name: " + cityName);
        System.out.println("Region name: " + region);
        System.out.println("Country name: " + country);
        System.out.println("Number of population: " + population);
        System.out.println("City postal index: " + postalIndexCity);
        System.out.println("Telephone city code: " + phoneCodeCity);
    }

    public String getCityName() {
        return cityName;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public long getPopulation() {
        return population;
    }

    public int getPostalIndexCity() {
        return postalIndexCity;
    }

    public int getPhoneCodeCity() {
        return phoneCodeCity;
    }


    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setPostalIndexCity(int postalIndexCity) {
        this.postalIndexCity = postalIndexCity;
    }

    public void setPhoneCodeCity(int phoneCodeCity) {
        this.phoneCodeCity = phoneCodeCity;
    }
}
