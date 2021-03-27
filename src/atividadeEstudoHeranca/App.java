package atividadeEstudoHeranca;

import atividadeEstudoHeranca.employee.Employee;
import atividadeEstudoHeranca.employee.EmployeeType;
import atividadeEstudoHeranca.softwaredeveloper.SoftwareDeveloper;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private boolean shouldContinueExecuting = true;
    private final Scanner scanner = new Scanner(System.in);
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public void execute(){

        employees.add(
                new Employee("José", "001", EmployeeType.REGULAR_EMPLOYEE)
        );
        employees.add(
                new SoftwareDeveloper("Fabricio", "002","Python")
        );

        printEmployeesNames();
        printDevelopersMainLanguages();

        //TODO: exercise 2 and 3
    }

    private void printEmployeesNames(){
        System.out.println("\nOs funcionários são:");
        employees.forEach(employee -> System.out.println(employee.getName() + " - " + employee.getCode()));
    }

    private void printDevelopersMainLanguages(){
        System.out.println("\nOs programadores com suas respectivas linguages são:");
        employees.
                stream().
                filter(
                        employee -> employee.getEmployeeType().equals(EmployeeType.SOFTWARE_DEVELOPER))
                .forEach(
                        employee ->
                            System.out.println( employee.getName() + " - " + ((SoftwareDeveloper)employee).getMainLanguage()));
    }
}
