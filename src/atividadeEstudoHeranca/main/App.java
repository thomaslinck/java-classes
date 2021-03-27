package atividadeEstudoHeranca.main;

import atividadeEstudoHeranca.employee.Employee;
import atividadeEstudoHeranca.softwaredeveloper.SoftwareDeveloper;

import java.util.ArrayList;
import java.util.stream.Stream;

public class App {
    private final InputDataGenerator inputDataGenerator = new InputDataGenerator();

    private boolean shouldContinueExecuting = true;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public void execute(){

        addEmployees();
        setProgrammingLanguagesToSoftwareDevelopers();
        printEmployeesNames();
        printDevelopersMainLanguages();
        
        //TODO: compareDevelopers(); using SoftwareDevelopersComparator class

    }

    private void addEmployees(){
        employees = new InputDataGenerator().generateEmployees(5);
    }

    private void setProgrammingLanguagesToSoftwareDevelopers(){
        getDevelopersAmongEmployees().forEach(
                developer -> {
                    ((SoftwareDeveloper)developer).setProgrammingLanguages(
                            inputDataGenerator.generateProgrammingLanguages()
                    );
                }
        );
    }

    private void printEmployeesNames(){
        System.out.println("\nOs funcionários são:");
        employees.forEach(employee -> System.out.println(employee.getName() + " - " + employee.getCode()));
    }

    private void printDevelopersMainLanguages(){
        System.out.println("\nOs programadores com suas respectivas linguages são:");
        getDevelopersAmongEmployees()
                .forEach(
                        developer -> {
                            System.out.println(developer.getName() + ":");
                            ((SoftwareDeveloper)developer).getProgrammingLanguages()
                                    .stream()
                                    .forEach(
                                            programmingLanguage ->
                                                    System.out.println(
                                                            programmingLanguage.getLanguage() + " - " +
                                                            programmingLanguage.getExperienceInYears()
                                                    )
                                    );
                        }
                );
    }

    private Stream <Employee> getDevelopersAmongEmployees(){
        return employees.stream().filter(e -> e.getClass().equals(SoftwareDeveloper.class));
    }
}
