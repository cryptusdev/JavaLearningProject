package com.yollacademy.lessons;

public class Person {


    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private String ssn;

    public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}

//Methods
//        Create a public getters and setters for firstname and lastname and SSN
//        getFirstname
//        getLastname
//        setFirstname
//        setLastname
//
//        Create a public getter method called getBirthdate, which will return a String composed of their birthday in month/day/year format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"
//
//        Create a public method called verifySSN that takes in a String parameter and returns a boolean.  It will check the parameter against the person's SSN and return true or false based on whether they match.