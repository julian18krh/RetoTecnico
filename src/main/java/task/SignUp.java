package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.UtestSignUp;

public class SignUp implements Task {
    public static SignUp onThePage(String strName, String strLname) {
        return Tasks.instrumented(SignUp.class,strName,strLname);
    }
    private String strLname;

    public SignUp(String strName, String strLname) {
        this.strName = strName;
        this.strLname = strLname;
    }

    private String strName;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                (Click.on(UtestSignUp.JOIN_BUTTON)),
                Enter.theValue(strName).into(UtestSignUp.FIRST_NAME),
                Enter.theValue(strLname).into(UtestSignUp.LAST_NAME),
                Enter.theValue("julian18kr@yopmail.com").into(UtestSignUp.EMAIL),
                SelectFromOptions.byIndex(6).from(UtestSignUp.MONTH_LIST),
                SelectFromOptions.byIndex(18).from(UtestSignUp.DAY_LIST),
                SelectFromOptions.byIndex(6).from(UtestSignUp.YEAR_LIST),
                Enter.theValue("spanish").into(UtestSignUp.LANGUAGE),
                Click.on(UtestSignUp.SELECT_LANG),
                Click.on(UtestSignUp.NEXT_PAGE),
                // Second Page
                Enter.theValue("Bogota").into(UtestSignUp.CITY_INPUT),
                Enter.theValue("111156").into(UtestSignUp.POSTAL_CODE_INPUT),
                Click.on(UtestSignUp.COUNTRY_LIST),
                Enter.theValue("Colombia").into(UtestSignUp.IMPUT_COUNTRY),
                Click.on(UtestSignUp.SELECT_COUNTRY),
                Click.on(UtestSignUp.NEXT_PAGE_DEVICES),
                // third Page

                Click.on(UtestSignUp.BRAND_LIST),
                Enter.theValue("Xiaomi").into(UtestSignUp.IMPUT_BRAND),
                Click.on(UtestSignUp.SELECT_BRAND),

                Click.on(UtestSignUp.MODEL_LIST),
                Enter.theValue("Redmi Note 10S").into(UtestSignUp.IMPUT_MODEL),
                Click.on(UtestSignUp.SELECT_MODEL),

                Click.on(UtestSignUp.OS_LIST),
                Click.on(UtestSignUp.SELECT_OS),

                Click.on(UtestSignUp.NEXT_LAST)



                );
    }
}
