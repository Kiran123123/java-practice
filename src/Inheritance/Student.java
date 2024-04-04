package Inheritance;

public class Student extends University{
    String course;
    int year;

    public Student(String course,int year,int id, String name, String phoneNo, String email, String address){
        super(id, name, phoneNo, email, address);
        this.course=course;
        this.year=year;
    }
    public void ShowStudentDetails(){
        System.out.println("Details of Student  " +name +" = " + " year : " + year +", courese : "  + course + ", phone number : " + phoneNo + ", id : "+id );

    }
}
