package atividadeEstudoHeranca.employee;


public class Employee {

    private String name;
    private String code;

    public Employee(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
