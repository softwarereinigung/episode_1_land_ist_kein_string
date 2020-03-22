package de.softwarereinigung.episode01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationServiceTest {

    private ApplicationService cut;

    @BeforeEach
    void setUp() {
        cut = new ApplicationService();
    }

    @Test
    @DisplayName("Should return Currency EUR and Language GERMAN for country germany.")
    void testGermany() {
        CurrencyAndLanguages result = cut.currencyAndLanguagesFor("DE");
        assertThat(result.getCurrency()).isEqualTo(Currency.EUR);
        assertThat(result.getLanguages()).containsOnly(Language.GERMAN);
    }

    @Test
    @DisplayName("Should return Currency EUR and Language GERMAN for country austria.")
    void testAustria() {
        CurrencyAndLanguages result = cut.currencyAndLanguagesFor("AT");
        assertThat(result.getCurrency()).isEqualTo(Currency.EUR);
        assertThat(result.getLanguages()).containsOnly(Language.GERMAN);
    }

    @Test
    @DisplayName("Should return Currency EUR and Language FRENCH for country france.")
    void testFrance() {
        CurrencyAndLanguages result = cut.currencyAndLanguagesFor("FR");
        assertThat(result.getCurrency()).isEqualTo(Currency.EUR);
        assertThat(result.getLanguages()).containsOnly(Language.FRENCH);
    }

    @Test
    @DisplayName("Should return Currency EUR and Language FRENCH for country switzerland.")
    void testSwitzerland() {
        CurrencyAndLanguages result = cut.currencyAndLanguagesFor("CH");
        assertThat(result.getCurrency()).isEqualTo(Currency.CHF);
        assertThat(result.getLanguages()).contains(Language.GERMAN, Language.FRENCH, Language.ITALIAN);
    }
}