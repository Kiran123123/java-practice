package Inheritance;

public class Employee extends University{

    int salary;
    String department;
    String dateOfJoining;

    public Employee(int salary,String department, String dateOfJoining,int id, String name, String phoneNo, String email, String address){
        super(id, name, phoneNo, email, address);
        this.salary=salary;
        this.department=department;
        this.dateOfJoining=dateOfJoining;
    }

    public void ShowEmployeeDetails(){
        System.out.println("Details of Employee name " +name +" = " + ", salary : " + salary +", department : "  + department + ", dateOfJoining : " + dateOfJoining + ", id : "+id );

    }

}
