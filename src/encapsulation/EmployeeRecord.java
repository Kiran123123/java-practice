package encapsulation;

public class EmployeeRecord {
    private int id;
    private String name;
    private String phoneNo;
    private String emailId;
    private String address;

    public EmployeeRecord(int id, String name, String phoneNo, String emailId, String address){
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
        this.address = address;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public String getEmailId(){
        return emailId;
    }
    public String getAddress(){
        return address;
    }


    public static void main(String[] args) {
        // Create employee objects
        EmployeeRecord[] employees = {
                new EmployeeRecord(101, "John Doe", "1234567890", "john.doe@example.com", "123 Main St, City"),
                new EmployeeRecord(102, "Jane Smith", "9876543210", "jane.smith@example.com", "456 Elm St, Town"),
                new EmployeeRecord(103, "Alice Johnson", "5551234567", "alice.johnson@example.com", "789 Oak St, Village"),
                // Add more employee records here
        };

        // Print employee details based on ID
        int idToSearch = 102; // ID to search
        boolean found = false;
        for (int i = 0; i < employees.length; i++) {
            EmployeeRecord employeeRecord = employees[i];
            if (employeeRecord.getId() == idToSearch) {
                System.out.println("Employee ID: " + employeeRecord.getId());
                System.out.println("Employee Name: " + employeeRecord.getName());
                System.out.println("Employee Phone No: " + employeeRecord.getPhoneNo());
                System.out.println("Employee Email ID: " + employeeRecord.getEmailId());
                System.out.println("Employee Address: " + employeeRecord.getAddress());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + idToSearch + " not found.");
        }
    }

}
