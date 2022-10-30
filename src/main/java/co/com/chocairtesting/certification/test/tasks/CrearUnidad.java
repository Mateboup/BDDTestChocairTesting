package co.com.chocairtesting.certification.test.tasks;

import static co.com.chocairtesting.certification.test.userinterface.CrearUnidadNegocio.*;
import static co.com.chocairtesting.certification.test.userinterface.PaginaPrincipalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class CrearUnidad implements Task {

  String nombreUnidadNegocio;
  String negocio;

  public CrearUnidad(String nombreUnidadNegocio, String negocio) {
    this.nombreUnidadNegocio = nombreUnidadNegocio;
    this.negocio = negocio;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(LBL_ORGANIZACION),
        Click.on(LBL_UNIDAD_NEGOCIO),
        Click.on(LBL_NUEVA_UNIDAD_NEGOCIO));
    actor.attemptsTo(
        Enter.theValue(nombreUnidadNegocio).into(TXT_NOMBRE_NUEVA_UNIDAD),
        Click.on(LST_UNIDADES),
        Enter.theValue(negocio).into(TXT_BUSCAR_UNIDADES).thenHit(Keys.ENTER),
        Click.on(BTN_GUARDAR));
  }

  public static Performable deNegocio(String nombreUnidadNegocio, String negocio) {
    return instrumented(CrearUnidad.class, nombreUnidadNegocio, negocio);
  }
}
