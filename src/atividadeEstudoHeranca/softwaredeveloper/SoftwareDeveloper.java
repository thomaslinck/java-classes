package atividadeEstudoHeranca.softwaredeveloper;

import atividadeEstudoHeranca.employee.Employee;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class SoftwareDeveloper extends Employee {
    private ArrayList<ProgrammingLanguage> programmingLanguages = new ArrayList<ProgrammingLanguage>();

    public SoftwareDeveloper(String name, String code){
        super(name, code);
    }

    public void addProgrammingLanguageToRanking(
            String language, int experienceInYears, ProgrammingLanguagesRanking placeInRanking){

        programmingLanguages.add(
                placeInRanking.getPosition(),
                new ProgrammingLanguage(language, experienceInYears, placeInRanking)
        );

    }

}
