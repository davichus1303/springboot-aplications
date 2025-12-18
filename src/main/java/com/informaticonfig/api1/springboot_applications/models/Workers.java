package com.informaticonfig.api1.springboot_applications.models;

public class Workers {
    private String name;
    private String lastName;
    private String address;
    private String position;
    private int age;
    private int phoneNumber;
    private static int idWorker;
    public Workers(String name, String lastName, String address, String position, int age, int phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.position = position;
        this.age = age;
        this.phoneNumber = phoneNumber;
        idWorker++;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public String getPosition() {
        return position;
    }
    public int getAge() {
        return age;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public static int getIdWorker() {
        return idWorker;
    }

    
}
