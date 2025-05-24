package Employee;

import java.util.Scanner;

public class ClientEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        
        Employee[] emp = new Employee[size];
        
        for(int i = 0; i < size; i++) {
            emp[i] = new Employee();
            System.out.print("Enter the EmpId: ");
            emp[i].setEmpId(sc.nextInt());
            System.out.print("Enter the Ename: ");
            emp[i].setEname(sc.next());
            System.out.print("Enter the Salary: ");
            emp[i].setSalary(sc.nextInt());
        }
        
        System.out.println("Show employees data:");
        for(int i = 0; i < size; i++) {
            System.out.println("Employee Id: " + emp[i].getEmpId() + 
                             " Employee name: " + emp[i].getEname() + 
                             " Employee salary: " + emp[i].getSalary());
        }
        
        // Sorting algorithm
        for(int i = 0; i < size - 1; i++) {
            int small = i;
            for(int j = i + 1; j < size; j++) {
                if(emp[j].getEmpId() < emp[small].getEmpId()) {
                    small = j;
                }
            }
            if(i != small) {
                Employee temp = emp[i];
                emp[i] = emp[small];
                emp[small] = temp;
            }
        }
        
        System.out.println("Sorted employees data:");
        for(int i = 0; i < size; i++) {
            System.out.println("Employee Id: " + emp[i].getEmpId() + 
                             " Employee name: " + emp[i].getEname() + 
                             " Employee salary: " + emp[i].getSalary());
        }
        
        sc.close();
    }
}