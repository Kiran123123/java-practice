package encapsulation;

import org.w3c.dom.ls.LSOutput;

public class EmployeeRecord {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee(100, "kiran", "123432", "kiran@gmail.com", "Mississauga");
        employees[1] = new Employee(101, "sachin", "129432", "sachin@gmail.com", "mumbai");
        employees[2] = new Employee(102, "rohit", "213432", "rohit@gmail.com", "toronto");
        employees[3] = new Employee(103, "yuvi", "313432", "yuvi@gmail.com", "punjab");
        employees[4] = new Employee(104, "dhoni", "178432", "dhoni@gmail.com", "chennai");
        employees[5] = new Employee(105, "bumrah", "165432", "bumrah@gmail.com", "brampton");
        employees[6] = new Employee(106, "rahul", "128832", "rahul@gmail.com", "scarborough");
        employees[7] = new Employee(107, "kohli", "155432", "kohli@gmail.com", "bangalore");
        employees[8] = new Employee(108, "pant", "873432", "pant@gmail.com", "delhi");
        employees[9] = new Employee(109, "sanju", "343432", "sanju@gmail.com", "kerala");


// Print employee details based on ID
        printEmployeeDetails(employees, 105);
        printEmployeeDetails(employees, 107);
        printEmployeeDetails(employees, 111); // Employee with ID 111 doesn't exist


/*        for (int i = 0; i < employees.length; i++) {
            employees[i].Showdetails();
        }*/
    }
    public static void printEmployeeDetails(Employee[] employees, int id) {
        boolean found = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                found = true;
                System.out.println("Employee found:");
                employees[i].Showdetails();
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

}
