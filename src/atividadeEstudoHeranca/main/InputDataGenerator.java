package atividadeEstudoHeranca.main;

import atividadeEstudoHeranca.employee.Employee;
import atividadeEstudoHeranca.employee.EmployeeFactory;
import atividadeEstudoHeranca.employee.EmployeeType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputDataGenerator {

    public InputDataGenerator(){
        names = Arrays.asList(
           "José", "Ricardo", "Joana", "Maria", "Roberta", "Roberto", "Sandro", "Felipe", "Ana", "Bruna"
        );

        codes = Arrays.asList(
                "001", "002", "003", "004", "005", "006", "007", "008", "009", "010"
        );
    }

    public ArrayList<Employee> generateEmployees(int number){
        ArrayList<Employee> employees = new ArrayList<>();

        for(int i=0; i<number; i++){
            employees.add(employeeFactory.make(names.get(i), codes.get(i), EmployeeType.REGULAR_EMPLOYEE));
        }

        return employees;
    }

    private final EmployeeFactory employeeFactory = new EmployeeFactory();

    private List<String> names = new ArrayList<>();
    private List<String> codes = new ArrayList<>();
}
