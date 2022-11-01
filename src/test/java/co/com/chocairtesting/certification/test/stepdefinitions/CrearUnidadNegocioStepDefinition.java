package co.com.chocairtesting.certification.test.stepdefinitions;

import static co.com.chocairtesting.certification.test.userinterface.AgendarReunionPage.LBL_REUNION_AGENDADA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

import co.com.chocairtesting.certification.test.questions.ValidarReunionAgendada;
import co.com.chocairtesting.certification.test.tasks.AgendarReunion;
import co.com.chocairtesting.certification.test.tasks.CrearUnidad;
import co.com.chocairtesting.certification.test.tasks.IniciarSesion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import java.util.Map;
import net.serenitybdd.screenplay.GivenWhenThen;

public class CrearUnidadNegocioStepDefinition {
  @Dado("que un asesor se loguea al sitio web StarSharp")
  public void queUnAsesorSeLogueaAlSitioWebStarSharp() {
    theActorInTheSpotlight().attemptsTo(IniciarSesion.enLaPaginaStarSharp());
  }

  @Cuando("el usuario cree una nueva unidad de negocio con nombre {string} con el negocio {string}")
  public void elUsuarioCreeUnaNuevaUnidadDeNegocioConNombreConElNegocio(
      String nombreUnidadNegocio, String negocio) {
    theActorInTheSpotlight().attemptsTo(CrearUnidad.deNegocio(nombreUnidadNegocio, negocio));
  }

  @Y("agende una reunión")
  public void agendeUnaReunión(Map<String, String> mapDatosAgendarReunion) {
    theActorInTheSpotlight().attemptsTo(AgendarReunion.deNegocio(mapDatosAgendarReunion));
  }

  @Entonces("la reunión debe quedar agendada exitosamente")
  public void laReuniónDebeQuedarAgendadaExitosamente() {
    theActorInTheSpotlight()
        .should(
            GivenWhenThen.seeThat(
                ValidarReunionAgendada.conLaData(LBL_REUNION_AGENDADA),
                equalTo(theActorInTheSpotlight().recall("NOMBRE_REUNION"))));
  }
}
