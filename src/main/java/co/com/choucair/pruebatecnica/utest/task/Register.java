package co.com.choucair.pruebatecnica.utest.task;

import co.com.choucair.pruebatecnica.utest.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.rest.interactions.Options;

public class Register implements Task {

    private String name;
    private String lastName;
    private String emailAddress;
    private String month;
    private String day;
    private String year;
    private String city;
    private String idioma;
    private String postalCode;
    private String country;
    private String computer;
    private String version;
    private String language;
    private String mobileDevice;
    private String model;
    private String os;
    private String password;
    private String confirPassword;

    public Register(String name, String lastName, String emailAddress, String month, String day, String year, String city, String idioma, String postalCode, String country, String computer, String version, String language, String mobileDevice, String model, String os, String password, String confirPassword) {
        this.name = name;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.month = month;
        this.day = day;
        this.year = year;
        this.city = city;
        this.idioma = idioma;
        this.postalCode = postalCode;
        this.country = country;
        this.computer = computer;
        this.version = version;
        this.language = language;
        this.mobileDevice = mobileDevice;
        this.model = model;
        this.os = os;
        this.password = password;
        this.confirPassword = confirPassword;
    }

    public static Register the(String name, String lastName, String emailAddress, String month, String day, String year, String city, String idioma, String postalCode, String country, String computer, String version, String language, String mobileDevice, String model, String os, String password, String confirPassword) {
        return Tasks.instrumented(Register.class, name,lastName,emailAddress,month,day,year,city,idioma,postalCode,country,computer,version,language,mobileDevice,model,os,password,confirPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UtestRegisterPage.JOIN_BUTTON),
                Enter.theValue(name).into(UtestRegisterPage.INPUT_NAME),
                Enter.theValue(lastName).into(UtestRegisterPage.INPUT_LASTNAME),
                Enter.theValue(emailAddress).into(UtestRegisterPage.INPUT_EMAIL),
                Click.on(UtestRegisterPage.BOX_MONTH.of(month)),
                Click.on(UtestRegisterPage.BOX_DAY.of(day)),
                Click.on(UtestRegisterPage.BOX_YEAR.of(year)),
                Click.on(UtestRegisterPage.BOX_IDIOMA),
                Click.on(UtestRegisterPage.SELECT.of(idioma)),

                Click.on(UtestRegisterPage.ENTER_BUTTON),

                Enter.theValue(city).into(UtestRegisterPage.INPUT_CITY),
                Enter.theValue(postalCode).into(UtestRegisterPage.INPUT_CODEPOSTAL),

                Click.on(UtestRegisterPage.BOX_COUNTRY),
                Click.on(UtestRegisterPage.SELECT.of(country)),

                Click.on(UtestRegisterPage.BUTTON_NEXT_DEVICES),

                Click.on(UtestRegisterPage.BOX_COMPUTER),
                Click.on(UtestRegisterPage.SELECT.of(computer)),

                Click.on(UtestRegisterPage.BOX_VERSION),
                Click.on(UtestRegisterPage.SELECT.of(version)),

                Click.on(UtestRegisterPage.BOX_LANGUAGE),
                Click.on(UtestRegisterPage.SELECT.of(language)),

                Click.on(UtestRegisterPage.BOX_DEVICE),
                Click.on(UtestRegisterPage.SELECT.of(mobileDevice)),

                Click.on(UtestRegisterPage.BOX_MODEL),
                Click.on(UtestRegisterPage.SELECT.of(model)),

                Click.on(UtestRegisterPage.BOX_OS),
                Click.on(UtestRegisterPage.SELECT.of(os)),

                Click.on(UtestRegisterPage.BUTTON_NEXT),

                Enter.theValue(password).into(UtestRegisterPage.INPUT_PASSWORD),

                Enter.theValue(confirPassword).into(UtestRegisterPage.INPUT_CONFIR_PASSWORD),

                Click.on(UtestRegisterPage.CHECK_STAY),

                Click.on(UtestRegisterPage.CHECK_TERM),

                Click.on(UtestRegisterPage.CHECK_PRIVACY),

                Click.on(UtestRegisterPage.BUTTON_COMPLETE)


                );






    }
}
