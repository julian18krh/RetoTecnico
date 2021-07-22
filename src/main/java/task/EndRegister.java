package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.EndRegisterPage;

public class EndRegister implements Task {
    private String password;

    public EndRegister(String password) {
        this.password = password;
    }
    public static EndRegister the(String password) {
        return Tasks.instrumented(EndRegister.class,password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(password).into(EndRegisterPage.INPUT_PASSWORD),
                Enter.theValue(password).into(EndRegisterPage.CONFIRM_PASSWORD),
                Click.on(EndRegisterPage.ACCEPT_TERMS),
                Click.on(EndRegisterPage.ACCEPT_PRIVACY)/*,
                Click.on(EndRegisterPage.FINISH_BUTTON)*/
                );
    }
}
