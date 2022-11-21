
import java.util.ArrayList;
import java.util.Scanner;
public class Main {


        public static void main(String[] args) {
            int flag = 0;
            ArrayList<Employee> al = new ArrayList<Employee>();
            while (flag ==0){
                System.out.println("1). Add Employee to the DataBase\n" +
                        "2). Search for Employee\n" +
                        "3). Delete Employee Details\n" +
                        "4). Display all Employees working in this company\n" +
                        "5). EXIT\n");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your choice : ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        Employee.add(al);
                        break;
                    case 2:
                        Employee.search(al);
                        break;
                    case 3:
                        Employee.delete(al);
                        break;
                    case 4:
                        Employee.display(al);
                        break;
                    case 5:
                        flag =1;
                        break;
                }


            }
        }
}


