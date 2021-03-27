package atividadeEstudoHeranca;

import atividadeEstudoHeranca.employee.Employee;
import atividadeEstudoHeranca.employee.EmployeeFactory;
import atividadeEstudoHeranca.employee.EmployeeType;
import atividadeEstudoHeranca.softwaredeveloper.ProgrammingLanguagesRanking;
import atividadeEstudoHeranca.softwaredeveloper.SoftwareDeveloper;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeFactory employeeFactory = new EmployeeFactory();

    private boolean shouldContinueExecuting = true;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public void execute(){

        addEmployees();
        setProgrammingLanguagesToSoftwareDevelopers();
        printEmployeesNames();
        printDevelopersMainLanguages();

    }

    private void addEmployees(){
        employees.add(
                0,
                employeeFactory.make("José", "001", EmployeeType.REGULAR_EMPLOYEE)
        );
        employees.add(
                1,
                employeeFactory.make("Fabricio", "002", EmployeeType.SOFTWARE_DEVELOPER)
        );
    }

    private void setProgrammingLanguagesToSoftwareDevelopers(){
        var developer = (SoftwareDeveloper)employees.get(1);
        developer.addProgrammingLanguageToRanking("Java", 10, ProgrammingLanguagesRanking.FIRST);
        developer.addProgrammingLanguageToRanking("Python", 5, ProgrammingLanguagesRanking.SECOND);
        developer.addProgrammingLanguageToRanking("Elixir", 1, ProgrammingLanguagesRanking.THIRD);
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
                        employee -> employee.getClass().equals(SoftwareDeveloper.class))
                .forEach(
                        employee -> {
                            System.out.println(employee.getName() + ":");
                            ((SoftwareDeveloper)employee).getProgrammingLanguages()
                                    .stream()
                                    .forEach(
                                            programmingLanguage ->
                                                    System.out.println(
                                                            programmingLanguage.getPlaceInRanking().getPosition() + " - " +
                                                                    programmingLanguage.getLanguage() + " - " +
                                                                    programmingLanguage.getExperienceInYears()
                                                    )
                                    );
                        }
                );
    }
}
