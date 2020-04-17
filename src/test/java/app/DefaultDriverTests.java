package app;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;

@DisplayName("Default Selenide driver tests")
class DefaultDriverTests {
    @BeforeEach
    void setUp() {
        Configuration.driverManagerEnabled = false;
		String url = "http://localhost:4444/wd/hub";
        Configuration.remote = url;
    }

    @Test
    @DisplayName("Able to run default driver on Selenoid")
    void ableToRunDefaultDriverOnSelenoid() {

        open("https://www.google.com");
        assertEquals(title(), "Google");
    }

}
