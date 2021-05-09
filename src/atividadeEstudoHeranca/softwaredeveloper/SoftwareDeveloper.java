package atividadeEstudoHeranca.softwaredeveloper;

import atividadeEstudoHeranca.employee.Employee;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class SoftwareDeveloper extends Employee {
    private ArrayList<ProgrammingLanguage> programmingLanguages = new ArrayList<ProgrammingLanguage>();

    public SoftwareDeveloper(String name, String code){
        super(name, code);
    }
}
