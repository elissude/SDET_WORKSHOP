package components;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static fixture.Fixture.wait;

public class Form {
    private WebDriver driver;
    public Form(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(id = "userEmail")
    public WebElement userEmail;
    @FindBy(xpath = "//label[@for=\"gender-radio-2\"]")
    public WebElement genderRadiobutton;
    @FindBy(xpath = "//input[@placeholder=\"Mobile Number\"]")
    public WebElement mobile;
    @FindBy(id = "dateOfBirthInput")
    public WebElement calendar;
    @FindBy(xpath = "//select[contains(@class,\"year-select\")]")
    public WebElement yearSelector;
    @FindBy(xpath = "//*[contains(text(), '1997')]")
    public WebElement yearOfBirth;
    @FindBy(xpath = "//select[contains(@class,\"month-select\")]")
    public WebElement monthSelector;
    @FindBy(xpath = "//*[contains(text(), 'October')]")
    public WebElement monthOfBirth;
    @FindBy(xpath = "//div[@aria-label=\"Choose Sunday, October 5th, 1997\"]")
    public WebElement dateOfBirth;
    @FindBy(css = "div.subjects-auto-complete__control.css-yk16xz-control")
    public WebElement subjects;
    @FindBy(id = "subjectsInput")
    public WebElement subjectsField;
    @FindBy(xpath = "//*[contains(text(), 'Computer')]")
    public WebElement mySubjects;
    @FindBy(xpath = "//*[contains(text(), 'Music')]")
    public WebElement checkboxMusic;
    @FindBy(xpath = "//input[@type=\"file\"]")
    public WebElement pictureUploader;
    @FindBy(id = "currentAddress")
    public WebElement currentAddress;
    @FindBy(xpath = "//*[contains(text(), 'Select State')]")
    public WebElement stateSelector;
    @FindBy(xpath = "//*[contains(text(), 'Select City')]")
    public WebElement citySelector;
    @FindBy(xpath = "//*[contains(text(), 'Uttar Pradesh')]")
    public WebElement state;
    @FindBy(xpath = "//*[contains(text(), 'Agra')]")
    public WebElement city;
    @FindBy(id = "submit")
    public WebElement submit;

    @Step("Заполнить поля формы")
    public void fillPracticeForm() {
       wait.until(ExpectedConditions.visibilityOf(firstName));
       firstName.sendKeys("Elis");
       lastName.sendKeys("Sude");
       userEmail.sendKeys("el.sudovska@gmail.com");
       genderRadiobutton.click();
       mobile.sendKeys("9812345678");
       calendar.click();
       yearSelector.click();
       yearOfBirth.click();
       monthSelector.click();
       monthOfBirth.click();
       dateOfBirth.click();
       subjects.click();
       subjectsField.sendKeys("c");
       mySubjects.click();
       checkboxMusic.click();
       pictureUploader.sendKeys("C:\\Users\\Lenovo\\OneDrive\\Рабочий стол\\workshop\\kisa.jpg"); //введите свой путь до файла согласно инструкции в Readme файле
       currentAddress.sendKeys("blablabla");
       stateSelector.click();
       state.click();
       citySelector.click();
       wait.until(ExpectedConditions.visibilityOf(city));
       city.click();
       submit.sendKeys(Keys.ENTER);
    }

}


