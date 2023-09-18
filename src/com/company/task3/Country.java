package com.company.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {
    private String countryName;
    private String continent;
    private long population;
    private int phoneCountryCode;
    private String capital;
    private List<String> cities;

    public Country() {
        countryName = "";
        continent = "";
        population = 0;
        phoneCountryCode = 0;
        capital = "";
        cities = new ArrayList<String>();
    }

    public void inputCountry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country name: ");
        while (true) {
            countryName = scanner.nextLine();
            if (countryName.length() >= 3) {
                break;
            } else {
                System.out.println("Error, country name must contain at least 3 characters.");
            }
        }
        System.out.print("Enter continent: ");
        while (true) {
            continent = scanner.nextLine();
            if (continent.length() >= 3) {
                break;
            } else {
                System.out.println("Error, continent must contain at least 3 characters.");
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
        while(true) {
            try {
                System.out.print("Enter telephone country code: ");
                phoneCountryCode = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error, enter correct data!");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        System.out.print("Enter capital: ");
        while (true) {
            capital = scanner.nextLine();
            if (capital.length() >= 3) {
                break;
            } else {
                System.out.println("Error, capital must contain at least 3 characters.");
            }
        }

        cities.clear();
        System.out.println("Enter the names of the cities in the country. If you want to end, enter 'end'.");
        String city;
        while (true) {
            while (true) {
                city = scanner.nextLine();
                if (city.length() >= 3) {
                    break;
                } else {
                    System.out.println("Error, city must contain at least 3 characters.");
                }
            }
            if (city.equals("end")) {
                break;
            }
            cities.add(city);
        }
    }

    public void showDataCountry() {
        System.out.println("Country name: " + countryName);
        System.out.println("Continent: " + continent);
        System.out.println("Number of population: " + population);
        System.out.println("Telephone country code: " + phoneCountryCode);
        System.out.println("Capital: " + capital);
        System.out.println("Cities of the country: ");
        for (String city : cities) {
            System.out.println(city);
        }
    }

    public String getCountryName() {
        return countryName;
    }

    public String getContinent() {
        return continent;
    }

    public long getPopulation() {
        return population;
    }

    public int getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public String getCapital() {
        return capital;
    }

    public List<String> getCities() {
        return cities;
    }


    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setPhoneCountryCode(int phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
}
