
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    int id;
    String name;
    String designation;
    String companyName;
    float salary;
    long contactNo;
    String emailId;



    public Employee(int id, String name, float salary, long contact_no, String email_id, String designation, String company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.contactNo = contact_no;
        this.emailId = email_id;
        this.designation = designation;
        this.companyName = company;
    }
    public String toString() {
        return "\nEmployee Details :" + "\nID: " + this.id + "\nName: " + this.name + "\nSalary: " +
                this.salary + "\nContact No: " + this.contactNo + "\nEmail-id: " + this.emailId
                + "\nCompany " + this.companyName + "\nDesignation: " + this.designation;
    }
    static void display(ArrayList<Employee> al) {
        System.out.println("\nEmployee List\n");
        for (Employee e : al) {
            System.out.println((e.id));
            System.out.println((e.salary));
            System.out.println((e.name));
            System.out.println((e.companyName));
            System.out.println((e.contactNo));
            System.out.println((e.emailId));
            System.out.println((e.designation));
            System.out.println("   ");
        }
    }



    static void search(ArrayList<Employee> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee ID to search :");
        int id = sc.nextInt();
        int i = 0;
        for (Employee e : al) {
            if (id == e.id) {
                System.out.println(e + "\n");
                i++;
            }
        }
        if (i == 0) {
            System.out.println("\nEmployee Details  not available, Please enter  valid ID");
        }
    }



    static void delete(ArrayList<Employee> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Employee ID to DELETE");
        int id = sc.nextInt();
        int k = 0;
        for (Employee e : al) {
            if (id == e.id) {
                al.remove(e);
                Employee.display(al);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("\nEmployee Details  not available, Please enter  valid ID");
        }
    }



    static void add(ArrayList<Employee> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the following details to ADD list:\n");
        System.out.println("Enter ID :");
        int id = sc.nextInt();
        System.out.println("Enter Name :");
        String name = sc.next();
        System.out.println("Enter Salary :");
        float salary = sc.nextFloat();
        System.out.println("Enter Contact No :");
        long contactNo = sc.nextLong();
        System.out.println("Enter Email-ID :");
        String emailId = sc.next();
        System.out.println("Enter Designation :");
        String designation = sc.next();
        System.out.println("Enter Company :");
        String company = sc.next();
        al.add(new Employee(id, name, salary, contactNo, emailId, designation, company));
    }



}




