package tests;

import components.Form;
import components.ResultTable;
import fixture.Fixture;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;
public class Test extends Fixture {
    protected Form form;
    protected ResultTable resultTable;
    @BeforeEach
    public void before() {
        form = new Form(driver);
        resultTable = new ResultTable(driver);
    }
    @Story("Заполнить Practice Form")
    @org.junit.jupiter.api.Test
    public void practiceForm() {
        form.fillPracticeForm();
        resultTable.getHeadOfResultForm();
        assertThat(resultTable.getHeadOfResultForm()).isEqualTo("Thanks for submitting the form");
        assertThat(resultTable.getStudentNameResult()).isEqualTo("Elis Sude");
        assertThat(resultTable.getStudentEmailResult()).isEqualTo("el.sudovska@gmail.com");
        assertThat(resultTable.getGenderResult()).isEqualTo("Female");
        assertThat(resultTable.getMobileResult()).isEqualTo("9812345678");
        assertThat(resultTable.getDateOfBirthResult()).isEqualTo("05 October,1997");
        assertThat(resultTable.getSubjectsResult()).isEqualTo("Computer Science");
        assertThat(resultTable.getHobbiesResult()).isEqualTo("Music");
        assertThat(resultTable.getPictureResult()).isEqualTo("kisa.jpg");
        assertThat(resultTable.getAddressResult()).isEqualTo("blablabla");
        assertThat(resultTable.getStateAndCityResult()).isEqualTo("Uttar Pradesh Agra");
    }

}