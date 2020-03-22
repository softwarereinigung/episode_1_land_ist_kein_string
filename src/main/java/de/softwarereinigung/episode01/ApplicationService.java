package de.softwarereinigung.episode01;

import java.util.EnumSet;
import java.util.Set;

public class ApplicationService {

    // Can you smell it?!?
    public CurrencyAndLanguages currencyAndLanguagesFor(String country) {
        Currency currency;
        if ("DE".equals(country) || "AT".equals(country) || "FR".equals(country)) {
            currency = Currency.EUR;
        } else {
            currency = Currency.CHF;
        }
        Set<Language> languages;
        if ("DE".equals(country) || "AT".equals(country)) {
            languages = EnumSet.of(Language.GERMAN);
        } else if ("FR".equals(country)) {
            languages = EnumSet.of(Language.FRENCH);
        } else {
            languages = EnumSet.of(Language.GERMAN, Language.FRENCH, Language.ITALIAN);
        }
        return new CurrencyAndLanguages(currency, languages);
    }

}
