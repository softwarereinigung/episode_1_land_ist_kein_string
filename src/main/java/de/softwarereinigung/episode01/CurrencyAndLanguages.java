package de.softwarereinigung.episode01;

import lombok.Data;

import java.util.Set;

@Data
public class CurrencyAndLanguages {

    private final Currency currency;
    private final Set<Language> languages;

}
