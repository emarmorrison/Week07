package CSAT.Employee;

import CSAT.Gender;
import CSAT.Person;
import CSAT.vehicle.Vehicle;

public class Employee extends Person {

    Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, Double salary) {
        super(id, firstName, lastName, gender, vehicle);
        this.salary = salary;
    }

    public Employee(Double salary) {
        this.salary = salary;
    }
}
