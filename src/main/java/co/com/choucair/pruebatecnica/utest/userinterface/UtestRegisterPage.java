package co.com.choucair.pruebatecnica.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to register")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_NAME = Target.the("where do we write the name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the lastname")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target BOX_MONTH = Target.the("button that shows us the form to register")
            .locatedBy("//select[@id='birthMonth']//option[text()='{0}']");
    public static final Target BOX_DAY = Target.the("button that shows us the form to register")
            .locatedBy("//select[@id='birthDay']//option[text()='{0}']");
    public static final Target BOX_YEAR = Target.the("button that shows us the form to register")
            .locatedBy("//select[@id='birthYear']//option[text()='{0}']");
    public static final Target BOX_IDIOMA = Target.the("button that shows us the form to country")
            .locatedBy("//div[@id='languages']");
    public static final Target ENTER_BUTTON = Target.the("where to next step")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a"));
    public static final Target INPUT_CITY = Target.the("where do we write the ciudad")
            .located(By.id("city"));
    public static final Target INPUT_CODEPOSTAL = Target.the("where do we write the codepostal")
            .located(By.id("zip"));
    public static final Target BOX_COUNTRY = Target.the("button that shows us the form to country")
            .locatedBy("//div[@name='countryId']");
    public static final Target SELECT = Target.the("button that shows us the form to register")
            .locatedBy("//*[contains(@id,'ui-select-choices-row-')]//div[text()='{0}']");
    public static final Target BUTTON_NEXT_DEVICES = Target.the("where to next step")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
    public static final Target BOX_COMPUTER = Target.the("button that shows us the form to computerr")
            .locatedBy("(//span[@class='ui-select-match-text pull-left ui-select-allow-clear'])[1]");
    public static final Target BOX_VERSION = Target.the("button that shows us the form to version")
            .locatedBy("(//*[@class='ui-select-box'])[2]");
    public static final Target BOX_LANGUAGE = Target.the("button that shows us the form to language")
            .locatedBy("(//*[@class='ui-select-box'])[3]");
    public static final Target BOX_DEVICE = Target.the("button that shows us the form to device")
            .locatedBy("(//*[@class='ui-select-box'])[4]");
    public static final Target BOX_MODEL = Target.the("button that shows us the form to model")
            .locatedBy("(//*[@class='ui-select-box'])[5]");
    public static final Target BOX_OS = Target.the("button that shows us the form to os")
            .locatedBy("(//*[@class='ui-select-box'])[6]");
    public static final Target BUTTON_NEXT = Target.the("where to next step")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIR_PASSWORD = Target.the("where do we write the confirm password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY = Target.the("button that shows us the form to register")
            .located(By.xpath("//label[@class='input-check-box signup-consent signup-consent--highlight']"));
    public static final Target CHECK_TERM = Target.the("button that shows us the form to register")
            .located(By.xpath("//input[@id='termOfUse']"));
    public static final Target CHECK_PRIVACY = Target.the("button that shows us the form to register")
            .located(By.xpath("//input[@id='privacySetting']"));
    public static final Target BUTTON_COMPLETE = Target.the("where to next step")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));

}

