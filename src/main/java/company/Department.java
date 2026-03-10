package company;


import java.util.ArrayList;
import java.util.List;

public class Department {


    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public Department(){}

    public String getDeptName() {
        return deptName;
    }

    public void addEmployee(Employee e) {
        employees.add(e);

    }

    public int getNoOfEmployees() {
        return employees.size();
    }

    public Employee searchForEmployee(int empNo) throws Exception {
        for (Employee emp : employees) {
            if (emp.getEmployeeNo() == empNo) {
                return emp;
            }
        }
        throw new Exception("Employee not found in this department.");
    }

    public boolean deleteEmployee(int empNo) {
        for (Employee emp : employees) {
            if (emp.getEmployeeNo() == empNo) {
                employees.remove(emp);
                return true;
            }
        }
        return false;
    }
}
