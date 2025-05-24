package Employee;

public class Employee {
    private int empId;  
    private String ename;
    private int salary;
    
    public Employee() {
        this.empId = 100;
        this.ename = "yash";
        this.salary = 45000;
    }
    
    public int getEmpId() {
        return empId;
    }
    
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    
    public String getEname() {
        return ename;
    }
    
    public void setEname(String ename) { 
        this.ename = ename;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int value) {
        salary = value;
    }
}