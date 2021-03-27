package atividadeEstudoHeranca.softwaredeveloper;

import atividadeEstudoHeranca.employee.Employee;
import atividadeEstudoHeranca.employee.EmployeeType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SoftwareDeveloper extends Employee {
    private String mainLanguage;

    public SoftwareDeveloper(String name, String code, String mainLanguage){
        super(name, code, EmployeeType.SOFTWARE_DEVELOPER);
        this.mainLanguage = mainLanguage;
    }
}
