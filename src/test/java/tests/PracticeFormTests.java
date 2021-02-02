package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit5.SoftAssertsExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.PracticeFormPage;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.AssertionMode.SOFT;
import static pages.PracticeFormPage.checkSettings;

@ExtendWith({SoftAssertsExtension.class})
public class PracticeFormTests {

    @Test
    public void practiceFormTest() {
        Configuration.assertionMode = SOFT;
        new PracticeFormPage()
                .openUrl()
                .withFirstname("Maksim")
                .withLastname("Kanin")
                .withEmail("qa@mail.ru")
                .withGender("Male")
                .withMobileNumber("9119888888")
                .withDateOfBirth(17, "November", "1989")
                .withSubjects("Maths", "Chemistry")
                .withHobbies("Sports", "Reading", "Music")
                .withUploadedPicture("images/qa.png")
                .withAddress("Saint-Petersburg")
                .withStateAndCity("NCR", "Noida")
                .submit();
        checkSettings(expectedSettings());
    }

    private Map<String, String> expectedSettings() {
        Map<String, String> map = new HashMap<>();
        map.put("Student Name", "Maksim Kanin");
        map.put("Student Email", "qa@mail.ru");
        map.put("Gender", "Male");
        map.put("Mobile", "9119888888");
        map.put("Date of Birth", "17 November,1989");
        map.put("Subjects", "Maths, Chemistry");
        map.put("Hobbies", "Sports, Reading, Music");
        map.put("Picture", "qa.png");
        map.put("Address", "Saint-Petersburg");
        map.put("State and City", "NCR Noida");
        return map;
    }
}
