package components;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static fixture.Fixture.wait;

public class ResultTable {
    private WebDriver driver;
    public ResultTable(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class=\"modal-content\"]")
    public WebElement resultFormWindow;
    @FindBy(id = "example-modal-sizes-title-lg")
    public WebElement heaOfResultFormWindow;
    @FindBy(xpath = "//*[contains(text(), 'Student Name')]//following-sibling::*")
    public WebElement studentNameResult;
    @FindBy(xpath = "//*[contains(text(), 'Student Email')]//following-sibling::*")
    public WebElement studentEmailResult;
    @FindBy(xpath = "(//*[contains(text(), 'Gender')]//following-sibling::*)[2]")
    public WebElement genderResult;
    @FindBy(xpath = "(//*[contains(text(), 'Mobile')]//following-sibling::*)[2]")
    public WebElement mobileResult;
    @FindBy(xpath = "//*[contains(text(), 'Date of Birth')]//following-sibling::*")
    public WebElement dateOfBirthResult;
    @FindBy(xpath = "//*[contains(text(), 'Subjects')]//following-sibling::*")
    public WebElement subjectsResult;
    @FindBy(xpath = "//*[contains(text(), 'Hobbies')]//following-sibling::*")
    public WebElement hobbiesResult;
    @FindBy(xpath = "//*[contains(text(), 'Picture')]//following-sibling::*")
    public WebElement pictureResult;
    @FindBy(xpath = "//*[contains(text(), 'Address')]//following-sibling::*")
    public WebElement addressResult;
    @FindBy(xpath = "//*[contains(text(), 'State and City')]//following-sibling::*")
    public WebElement stateAndCityResult;

    @Step("Получить текст заголовка модального окна после заполнения формы")
    public String getHeadOfResultForm() {
        wait.until(ExpectedConditions.visibilityOf(resultFormWindow));
        return heaOfResultFormWindow.getText();
    }

    @Step("Получить имя студента")
    public String getStudentNameResult() {
        return studentNameResult.getText();
        }

    @Step("Получить почту студента")
    public String getStudentEmailResult() {
        return studentEmailResult.getText();
    }

    @Step("Получить пол студента")
    public String getGenderResult() {
        return genderResult.getText();
    }
    @Step("Получить номер телефона студента")
    public String getMobileResult() {
        return mobileResult.getText();
    }
    @Step("Получить дату рождения студента")
    public String getDateOfBirthResult() {
        return dateOfBirthResult.getText();
    }
    @Step("Получить предмет студента")
    public String getSubjectsResult() {
        return subjectsResult.getText();
    }
    @Step("Получить хобби студента")
    public String getHobbiesResult() {
        return hobbiesResult.getText();
    }
    @Step("Получить фото студента")
    public String getPictureResult() {
        return pictureResult.getText();
    }
    @Step("Получить адрес студента")
    public String getAddressResult() {
        return addressResult.getText();
    }
    @Step("Получить страну и город студента")
    public String getStateAndCityResult() {
        return stateAndCityResult.getText();
    }

}


