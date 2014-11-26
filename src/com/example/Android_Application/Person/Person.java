package com.example.Android_Application.Person;

/**
 * Created by Admin on 2014-11-26.
 */
public class Person {

    private String name = "";
    private String surname = "";
    private String phoneNumber = "";

    public Person(String name, String surname, String phoneNumber)
    {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Imię: " + this.name + " Nazwisko: " + this.surname + " Nr. Tel.: " + this.phoneNumber;
    }
}
