package atividadeEstudoHeranca.employee;

import atividadeEstudoHeranca.softwaredeveloper.SoftwareDeveloper;

public class EmployeeFactory {
    public Employee make(EmployeeType employeeType){
        if (employeeType.equals(EmployeeType.SOFTWARE_DEVELOPER)) return new SoftwareDeveloper();
        else return new Employee(); 
    }
}
