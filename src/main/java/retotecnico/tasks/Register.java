package retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import retotecnico.userinterface.uTestRegister;

public class Register implements Task {
    public static Register OnThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestRegister.REGISTER_BUTTON),
                Enter.theValue("Dylan").into(uTestRegister.INPUT_FIRSTNAME),
                Enter.theValue("Barajas").into(uTestRegister.INPUT_LASTNAME),
                Enter.theValue("dylanbarajas@hotmail.com").into(uTestRegister.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("19").from(uTestRegister.INPUT_DAY),
                SelectFromOptions.byVisibleText("February").from(uTestRegister.INPUT_MONTH),
                SelectFromOptions.byVisibleText("2001").from(uTestRegister.INPUT_YEAR),
                Click.on(uTestRegister.ENTER_BUTTON),
                Enter.theValue("Santa Marta, Magdalena, Colombia").into(uTestRegister.INPUT_CITY),
                Enter.theValue("470003").into(uTestRegister.INPUT_POSTAL),
                SelectFromOptions.byVisibleText("Colombia").from(uTestRegister.INPUT_COUNTRY),
                Click.on(uTestRegister.ENTER_BUTTON2)
                );
    }
}
