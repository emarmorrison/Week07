package CSAT.Employee;

import CSAT.Gender;
import CSAT.vehicle.Vehicle;

public class Faculty extends Employee{

    String department;

    public Faculty(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, Double salary, String department) {
        super(id, firstName, lastName, gender, vehicle, salary);
        this.department = department;
    }

    public Faculty(Double salary, String department) {
        super(salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
