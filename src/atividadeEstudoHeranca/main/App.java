package atividadeEstudoHeranca.main;

import atividadeEstudoHeranca.employee.Employee;
import atividadeEstudoHeranca.softwaredeveloper.ProgrammingLanguagesRanking;
import atividadeEstudoHeranca.softwaredeveloper.SoftwareDeveloper;

import java.util.ArrayList;

public class App {

    private boolean shouldContinueExecuting = true;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public void execute(){

        addEmployees();
        //setProgrammingLanguagesToSoftwareDevelopers();
        printEmployeesNames();
        //printDevelopersMainLanguages();

    }

    private void addEmployees(){
        employees = new InputDataGenerator().generateEmployees(2);
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
