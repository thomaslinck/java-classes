package atividadeEstudoHeranca.employee;

import atividadeEstudoHeranca.softwaredeveloper.SoftwareDeveloper;

public class EmployeeFactory {

    public Employee make(String name, String code, EmployeeType employeeType){
        if(employeeType.equals(EmployeeType.SOFTWARE_DEVELOPER)) return new SoftwareDeveloper(name, code);
        else return new Employee(name, code);
    }
}
