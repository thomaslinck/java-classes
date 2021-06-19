package atividadeEstudoHeranca.softwaredeveloper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SoftwareDevelopersComparator {

    private SoftwareDeveloper baseSoftwareDeveloper;
    private SoftwareDeveloper comparisonSoftwareDeveloper;


    public SoftwareDeveloper compareExperienceInLanguage(String language) throws LanguageNotFound{

        var baseSoftwareDeveloperEntryForLanguageOptional =
                baseSoftwareDeveloper.getProgrammingLanguages()
                .stream()
                .filter(
                        programmingLanguage -> programmingLanguage.getLanguage().equals(language))
                .findFirst();

        var comparisonSoftwareDeveloperEntryForLanguageOptional =
                comparisonSoftwareDeveloper.getProgrammingLanguages()
                        .stream()
                        .filter(
                                programmingLanguage -> programmingLanguage.getLanguage().equals(language))
                        .findFirst();

        if(baseSoftwareDeveloperEntryForLanguageOptional.isEmpty() ||
                comparisonSoftwareDeveloperEntryForLanguageOptional.isEmpty()) throw new LanguageNotFound();

        return baseSoftwareDeveloperEntryForLanguageOptional.get().getExperienceInYears() >
               comparisonSoftwareDeveloperEntryForLanguageOptional.get().getExperienceInYears()
        ? baseSoftwareDeveloper : comparisonSoftwareDeveloper;
    }
}

