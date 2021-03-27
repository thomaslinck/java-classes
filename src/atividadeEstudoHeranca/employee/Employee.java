package atividadeEstudoHeranca.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Employee {

    private String name;
    private String code;
    private EmployeeType employeeType;

}
