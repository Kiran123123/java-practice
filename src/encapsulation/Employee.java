package encapsulation;

public class Employee {
    private int id;
    private String name;
    private String phoneNo;
    private String emailId;
    private String address;

    // Constructor
    public Employee(int id, String name, String phoneNo, String emailId, String address) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
        this.address = address;
    }



    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
//
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void Showdetails(){
        System.out.println("ID "+id);
        System.out.println("Name : "+name);
        System.out.println("Phone Number "+phoneNo);
        System.out.println("Email ID "+emailId);
        System.out.println("Address "+address);



            }


    public static void main(String[] args) {
        // Hardcoded employee details
        int id = 101;
        String name = "John Doe";
        String phoneNo = "1234567890";
        String emailId = "john.doe@example.com";
        String address = "123 Main St, City";

        // Create an employee object
        Employee employee = new Employee(id, name, phoneNo, emailId, address);
       // Employee employee1 = new Employee(110,"kiran", "875", "fhg@gmail.com", "brampton");
        employee.setId(111);
        employee.setName("kiran");

        // Print employee details
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Phone No: " + employee.getPhoneNo());
        System.out.println("Employee Email ID: " + employee.getEmailId());
        System.out.println("Employee Address: " + employee.getAddress());
    }
}
