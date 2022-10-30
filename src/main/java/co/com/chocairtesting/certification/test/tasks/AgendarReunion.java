package co.com.chocairtesting.certification.test.tasks;

import static co.com.chocairtesting.certification.test.userinterface.AgendarReunionPage.*;
import static co.com.chocairtesting.certification.test.userinterface.PaginaPrincipalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class AgendarReunion implements Task {

  private final Map<String, String> mapDatosAgendarReunion;

  public AgendarReunion(Map<String, String> mapDatosAgendarReunion) {
    this.mapDatosAgendarReunion = mapDatosAgendarReunion;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(LBL_REUNION), Click.on(LBL_AGENDAR_REUNION), Click.on(BTN_NUEVA_REUNION));
    actor.attemptsTo(
        Enter.theValue(mapDatosAgendarReunion.get("Nombre Reunión")).into(TXT_NOMBRE_REUNION));
    actor.attemptsTo(
        Click.on(LBL_TIPO_REUNION),
        Enter.theValue(mapDatosAgendarReunion.get("Tipo Reunión"))
            .into(LBL_BUSCAR_TIPO_REUNION)
            .thenHit(Keys.ENTER),
        Enter.theValue(mapDatosAgendarReunion.get("Fecha inicio")).into(LBL_FECHA_INICIO),
        Enter.theValue(mapDatosAgendarReunion.get("Fecha fin")).into(LBL_FECHA_FIN),
        Click.on(LST_UBICACION),
        Enter.theValue(mapDatosAgendarReunion.get("Ubicación"))
            .into(TXT_BUSCAR_UBICACION)
            .thenHit(Keys.ENTER));
    actor.attemptsTo(
        Click.on(LST_ORGANIZADOR),
        Enter.theValue(mapDatosAgendarReunion.get("Organizador"))
            .into(TXT_BUSCAR_ORGANIZADOR)
            .thenHit(Keys.ENTER),
        Click.on(LST_ASISTENTES),
        Enter.theValue(mapDatosAgendarReunion.get("Asistentes"))
            .into(TXT_BUSCAR_ASISTENTES)
            .thenHit(Keys.ENTER));
    actor.attemptsTo(
        Enter.theValue(mapDatosAgendarReunion.get("Numero Reunión")).into(TXT_NUMERO_REUNION),
        Click.on(LST_UNIDAD),
        Enter.theValue(mapDatosAgendarReunion.get("Unidad"))
            .into(TXT_BUSCAR_UNIDAD)
            .thenHit(Keys.ENTER),
        Click.on(LST_REPORTERO),
        Enter.theValue(mapDatosAgendarReunion.get("Reportero"))
            .into(TXT_REPORTERO)
            .thenHit(Keys.ENTER),
        Click.on(BTN_GUARDAR),
        Enter.theValue(mapDatosAgendarReunion.get("Nombre Reunión"))
            .into(TXT_BUSCAR_REUNION_AGENDADA));
    actor.remember("NOMBRE_REUNION", mapDatosAgendarReunion.get("Nombre Reunión"));
  }

  public static Performable deNegocio(Map<String, String> mapDatosAgendarReunion) {
    return instrumented(AgendarReunion.class, mapDatosAgendarReunion);
  }
}
