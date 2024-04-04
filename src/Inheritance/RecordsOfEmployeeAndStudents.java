package Inheritance;

import java.util.Arrays;

public class RecordsOfEmployeeAndStudents {

    public static Student[] studentDetails(){
        Student[] studentRecord = new Student[3];
        studentRecord[0] = new Student("Chemistry",2020,001,"Rahul","23654","Rahul@gmail.com","Oshawa");
        studentRecord[1] = new Student("Chemistry",2019,002,"Rohit","34556","Rohit@gmail.com","Ajax");
        studentRecord[2] = new Student("Chemistry",2021,003,"Dhoni","67845","Dhoni@gmail.com","Pickering");
        return studentRecord;
    }

    public static Employee[] employeeDetails(){
        Employee[] employeeRecords = new Employee[3];
        employeeRecords[0] = new Employee(3000,"arts", "2015",501,"Kiran","235475","kiran@gmail.com","Mississauga");
        employeeRecords[1] = new Employee(6000,"personal trainer", "2012",502,"Sachin","457694","sachin@gmail.com","Brampton");
        employeeRecords[2] = new Employee(1000,"science", "2019",503,"Dravid","558696","dravid@gmail.com","Milton");
        return employeeRecords;
    }
    public static void main(String[] args) {
        Student[] students = studentDetails();
        Employee[] employees = employeeDetails();
        printEmployeeDetails(employees);
        printStudentDetails(students);
    }


    public static void printEmployeeDetails(Employee[] employeeRecords){
        for(int i=0; i<employeeRecords.length; i++){
            employeeRecords[i].ShowEmployeeDetails();
        }
    }

    public static void printStudentDetails(Student[] studentRecord){
        for(int j=0;j<studentRecord.length; j++){
            studentRecord[j].ShowStudentDetails();
        }
    }
}
