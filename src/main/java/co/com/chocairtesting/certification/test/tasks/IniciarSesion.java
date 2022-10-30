package co.com.chocairtesting.certification.test.tasks;

import static co.com.chocairtesting.certification.test.userinterface.IniciarSesion.*;
import static co.com.chocairtesting.certification.test.utils.enums.EnumCredenciales.STARTSHARP;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IniciarSesion implements Task {

  public static Performable enLaPaginaStarSharp() {
    return instrumented(IniciarSesion.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(TXT_USUARIO, isVisible()).forNoMoreThan(10).seconds(),
        Enter.theValue(STARTSHARP.getUsuario()).into(TXT_USUARIO),
        Enter.theValue(STARTSHARP.getClave()).into(TXT_CLAVE),
        Click.on(BTN_REGISTRARSE));
  }
}
