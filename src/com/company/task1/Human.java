package com.company.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Human {
    private String fullName;
    private Date birthDate;
    private String contactPhone;
    private String city;
    private String country;
    private String homeAddress;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public Human(){
        fullName = "";
        birthDate = null;
        contactPhone = "";
        city = "";
        country = "";
        homeAddress = "";
    }

    public Human(String fullName, Date birthDate, String contactPhone, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.contactPhone = contactPhone;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    public void inputHuman(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full name: ");
        while (true) {
            fullName = scanner.nextLine();
            if (fullName.length() >= 5) {
                break;
            } else {
                System.out.println("Error, full name must contain at least 5 characters.");
            }
        }


        while (true) {
            System.out.print("Enter date of birth in the format dd.MM.yyyy: ");
            String birthDateString = scanner.nextLine();
            try {
                birthDate = dateFormat.parse(birthDateString);
                break;
            } catch (ParseException e) {
                System.out.println("Invalid date format, use dd.MM.yyyy. Example: 16.09.2023.");
            }
        }

        System.out.print("Enter contact phone number: ");
        while (true) {
            contactPhone = scanner.nextLine();
            if (contactPhone.length() >= 3) {
                break;
            } else {
                System.out.println("Error, contact phone must contain at least 3 digits.");
            }
        }


        System.out.print("Enter city: ");
        while (true) {
            city = scanner.nextLine();
            if (city.length() >= 3) {
                break;
            } else {
                System.out.println("Error, city must contain at least 3 characters.");
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

        System.out.print("Enter home address: ");
        while (true) {
            homeAddress = scanner.nextLine();
            if (homeAddress.length() >= 3) {
                break;
            } else {
                System.out.println("Error, homeAddress must contain at least 3 characters.");
            }
        }
    }

    public void showDataHuman(){
        System.out.println("Full name: " + fullName);
        System.out.println("Date of Birth: " + dateFormat.format(birthDate));
        System.out.println("Contact phone number: " + contactPhone);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Home address: " + homeAddress);
    }

    public String getFullName() {
        return fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
