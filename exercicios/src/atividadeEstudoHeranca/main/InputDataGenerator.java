package atividadeEstudoHeranca.main;

import atividadeEstudoHeranca.employee.Employee;
import atividadeEstudoHeranca.employee.EmployeeFactory;
import atividadeEstudoHeranca.employee.EmployeeType;
import atividadeEstudoHeranca.softwaredeveloper.ProgrammingLanguage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class InputDataGenerator {

    public InputDataGenerator(){
        names = Arrays.asList(
           "José", "Ricardo", "Joana", "Maria", "Roberta", "Roberto", "Sandro", "Felipe", "Ana", "Bruna"
        );

        codes = Arrays.asList(
                "001", "002", "003", "004", "005", "006", "007", "008", "009", "010"
        );

        programmingLanguagesNames = Arrays.asList(
                "Python", "Java", "Elixir", "SQL", ".NET", "C#", "ABAP", "JavaScript", "C", "COBOL"
        );
    }

    public ArrayList<Employee> generateEmployees(int number){
        ArrayList<Employee> employees = new ArrayList<>();

        for(int i=0; i<number; i++){
            employees.add(
                    employeeFactory.make(
                        names.get(random.nextInt(10)),
                        codes.get(random.nextInt(10)),
                        random.nextInt(2) == 0 ? EmployeeType.REGULAR_EMPLOYEE : EmployeeType.SOFTWARE_DEVELOPER
                    )
            );
        }

        return employees;
    }

    public ArrayList<ProgrammingLanguage> generateProgrammingLanguages(){
        ArrayList<ProgrammingLanguage> programmingLanguages = new ArrayList<>();

        for(int i=0; i<3; i++){
            programmingLanguages.add(
                    new ProgrammingLanguage(
                            programmingLanguagesNames.get(random.nextInt(10)),
                            random.nextInt(10)
                    )
            );
        }

        return programmingLanguages;
    }

    private final EmployeeFactory employeeFactory = new EmployeeFactory();
    private final Random random = new Random();

    private List<String> names = new ArrayList<>();
    private List<String> codes = new ArrayList<>();
    private List<String> programmingLanguagesNames = new ArrayList<>();

}
