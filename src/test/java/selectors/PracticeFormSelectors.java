package selectors;

import org.openqa.selenium.By;

import static org.openqa.selenium.By.cssSelector;

public final class PracticeFormSelectors {
    public static final By MAIN_HEADER = cssSelector(".main-header");
    public static final By FIRST_NAME_ID = cssSelector("#firstName");
    public static final By LAST_NAME_ID = cssSelector("#lastName");
    public static final By EMAIL_ID = cssSelector("#userEmail");
    public static final String GENDER_BY_TYPE = "input[name='gender'][value='%s']+label";
    public static final String MOBILE_NUMBER_ID = "#userNumber";
    public static final By DATE_OF_BIRTH_INPUT = cssSelector("#dateOfBirthInput");
    public static final By DATEPICKER = cssSelector(".react-datepicker__month-container");
    public static final By DATEPICKER_MONTH = cssSelector(".react-datepicker__month-select");
    public static final By DATEPICKER_YEAR = cssSelector(".react-datepicker__year-select");
    public static final String DATE_BY_NUMBER = ".react-datepicker__day--0%s";
    public static final By SUBJECTS = cssSelector("#subjectsContainer");
    public static final String HOBBY_BY_NAME = "//label[contains(@for,'hobbies-checkbox-') and .='%s']";
    public static final String UPLOAD_PICTURE_ID = "#uploadPicture";
    public static final String CURRENT_ADDRESS_ID = "#currentAddress";
    public static final By STATE_INPUT = cssSelector("#state input");
    public static final By CITY_INPUT = cssSelector("#city input");
    public static final By SUBMIT_ID = cssSelector("#submit");
    public static final String MODAL_SETTING_VALUE_BY_NAME = "//div[@class='modal-body']//td[.='%s']//following-sibling::td";
}
