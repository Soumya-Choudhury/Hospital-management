import java.util.*;
class Person extends Hospital{
    Scanner sc=new Scanner(System.in);
    String message;
    public void make_request(){
        System.out.println("Hello,Kindly make a request for booking an appointment or emergency");
        message=sc.nextLine();
        if(message.equalsIgnoreCase("Appointment")){
            bookappointment();
        }
        if(message.equalsIgnoreCase("Emergency")){
            emergency();
        }
    }
        public void bookappointment(){
            System.out.println("Please provide patient details");
            System.out.println("Full Name:");
            String name=sc.nextLine();
            System.out.println("Age:");
            int age=sc.nextInt();
            sc.nextLine();
            System.out.println("Phone no:");
            String phone_no=sc.nextLine();
            System.out.println("Problem suffering/Disease:");
            String problem=sc.nextLine(); 
            Doctors d=new Doctors();
            d.set_Appointment(name,age,phone_no,problem);
            d.get_Appointment();
            d.checkup();
        }
        public void emergency(){
            System.out.println("Kindly provide the details");
            System.out.println("Name");
            String name=sc.nextLine();
            System.out.println("Address:");
            String address=sc.nextLine();
            System.out.println("Phone no.:");
            String phone_no=sc.nextLine();
            System.out.println("Ambulance booked for the "+address);
        }
    }
class Patient_details extends Hospital_data{
   Scanner sc=new Scanner(System.in);
   String msg;
    public void details(){
        final int p_id=456789;
        int age=45;
        String name="Rohan";
        String address="M.G road";
        String phone_no="9112345670";
        String problem="Diabetes";
    }
    public void want_changes(){
        System.out.println("Patient ,do you want to make any changes to your phone no,address no or both");
        msg=sc.nextLine();
        if(msg.equalsIgnoreCase("address")){
            change_address();
        }
        if(msg.equalsIgnoreCase("Phone no")){
            change_phoneno();
        }
        if(msg.equalsIgnoreCase("Both")){
            change_both();
        }
    }
    public void change_address(){
        System.out.println("Enter corrected address:");
        String address=sc.nextLine();
        System.out.println("Patient address updated succesfully");
    }
    public void change_phoneno(){
        System.out.println("Enter new phone no:");
        String phone_no=sc.nextLine();
        System.out.println("Patient phone no updated succesfully");
    }
    public void change_both(){
        System.out.println("Enter corrected address:");
        String name=sc.nextLine();
        System.out.println("Enter new phone no:");
        String phone_no=sc.nextLine();
        System.out.println("Patient details updated successfully");
    }
}
abstract class Hospital{
    public String address;
    public String phone_no;
    abstract void bookappointment();
    abstract void emergency();
}
abstract class Hospital_data{
    abstract void details();
    abstract void want_changes();
    abstract void change_address();
    abstract void change_phoneno();
    abstract void change_both();
}

class Doctors_details extends Hospital_data{
   Scanner sc=new Scanner(System.in);
   String msg;
    public void details(){
        String name="Dr. Sampa Datta";
        final int d_id=67893;
        String Degree="MBBS,M.D";
        String address="90/B1 block,Sector-2,Gurgaon";
        String phone_no="9211112201";
        String speciality="Diabetes";
    }
    public void want_changes(){
        System.out.println("Doctor, do you want to make any changes to your phone no,address no or both");
        msg=sc.nextLine();
        if(msg.equalsIgnoreCase("address")){
            change_address();
        }
        if(msg.equalsIgnoreCase("Phone no")){
            change_phoneno();
        }
        if(msg.equalsIgnoreCase("Both")){
            change_both();
        }
    }
    public void change_address(){
        System.out.println("Enter corrected address:");
        String address=sc.nextLine();
        System.out.println("Doctor address updated succesfully");
    }
    public void change_phoneno(){
        System.out.println("Enter new phone no:");
        String phone_no=sc.nextLine();
        System.out.println("Doctor phone no updated succesfully");
    }
    public void change_both(){
        System.out.println("Enter corrected address:");
        String name=sc.nextLine();
        System.out.println("Enter new phone no:");
        String phone_no=sc.nextLine();
        System.out.println("Doctor details updated successfully");
    }
}
class Hospital_dbms{
    public void info(Hospital_data ref){
        ref.want_changes();
    }
}
class Doctors{
    private String name;
    private int age;
    private String phone_no;
    private String problem;
    private int p_id;
    public void set_Appointment(String name,int age,String phone_no,String problem){
        this.name=name;
        this.age=age;
        this.phone_no=phone_no;
        this.problem=problem;
    }
    public void get_Appointment(){
        System.out.println("Appointment booked with successfully with patient id:212 and name"+name);
    }
    public void checkup(){
        System.out.println("Patient checkup complete");
    }
}
public class Hospitalmanagement{
    public static void main(String[] args) {
        Person p1=new Person();
        p1.make_request();
        Doctors_details dd=new Doctors_details();
        Patient_details pd=new Patient_details();
        Hospital_dbms i=new Hospital_dbms();
        i.info(dd);
        i.info(pd);
    }
}
