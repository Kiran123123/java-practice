package encapsulation;

public class EmployeeRecordWithName {

    public static void printEmployeeDetailsWithName(Employee[] employees, String name) {
        boolean found = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName() == name) {
                found = true;
                System.out.println("Employee found:");
                employees[i].Showdetails();
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with name " + name + " not found.");
        }
    }

    public static void main(String[] args) {

        // Print employee details based on ID

        Employee[] employees = EmployeeRecord.getEmployeeDetails();


        printEmployeeDetailsWithName(employees, "kiran");
        printEmployeeDetailsWithName(employees, "sachin");
        printEmployeeDetailsWithName(employees, "Gayle");
    }
}


//String name = "Kiran";


