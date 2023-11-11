package de.inosofttech.springbootrestapi.bean;

public class Student {

    private int id;
    private String firstName;
    private String lastname;


    public Student(int id, String firstName, String lastname) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }
}

