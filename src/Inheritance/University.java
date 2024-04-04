package Inheritance;

public class University {

    int id;
    String name;
    String phoneNo;
    String email;
    String address;

    public University(int id, String name, String phoneNo, String email, String address){
        this.id=id;
        this.name=name;
        this.phoneNo=phoneNo;
        this.email=email;
        this.address=address;
    }

    public int getId(){
        return id;
    }


}
