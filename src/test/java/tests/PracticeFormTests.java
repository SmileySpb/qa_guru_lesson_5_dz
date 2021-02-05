package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit5.SoftAssertsExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.PracticeFormPage;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.AssertionMode.SOFT;
import static pages.PracticeFormPage.assertPracticeForm;

@ExtendWith({SoftAssertsExtension.class})
public class PracticeFormTests {

    @Test
    public void practiceFormTest() {
        Configuration.assertionMode = SOFT;
        new PracticeFormPage()
                .openUrl()
                .withFirstname(expectedSettings().get("Student Name").split(" ")[0])
                .withLastname(expectedSettings().get("Student Name").split(" ")[1])
                .withEmail(expectedSettings().get("Student Email"))
                .withGender(expectedSettings().get("Gender"))
                .withMobileNumber(expectedSettings().get("Mobile"))
                .withDateOfBirth(Integer.parseInt(expectedSettings().get("Date of Birth")
                                .split(",")[0]
                                .split(" ")[0]),
                        expectedSettings().get("Date of Birth")
                                .split(",")[0]
                                .split(" ")[1],
                        expectedSettings().get("Date of Birth")
                                .split(",")[1])
                .withSubjects(expectedSettings().get("Subjects").split(","))
                .withHobbies(expectedSettings().get("Hobbies").replaceAll(" ", "").split(","))
                .withUploadedPicture(expectedSettings().get("Picture"))
                .withAddress(expectedSettings().get("Address"))
                .withStateAndCity(expectedSettings().get("State and City").split(" ")[0]
                        , expectedSettings().get("State and City").split(" ")[1])
                .submit();
        assertPracticeForm(expectedSettings());
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
