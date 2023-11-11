package de.inosofttech.springbootrestapi.bean;

public class Student {

    private final int id;
    private final String firstName;
    private final String lastName;


    public Student(int id, String firstName, String lastname) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

