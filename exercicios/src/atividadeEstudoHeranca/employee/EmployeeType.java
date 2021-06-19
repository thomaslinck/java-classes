package atividadeEstudoHeranca.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EmployeeType {
    REGULAR_EMPLOYEE("1 - Regular Employee"),
    SOFTWARE_DEVELOPER("2 - Software Developer");

    String humanReadableType;
}
