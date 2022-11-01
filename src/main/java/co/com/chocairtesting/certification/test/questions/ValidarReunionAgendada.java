package co.com.chocairtesting.certification.test.questions;

import static net.serenitybdd.screenplay.questions.Text.of;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarReunionAgendada implements Question<String> {
  private Target mensaje;

  public ValidarReunionAgendada(Target message) {
    this.mensaje = message;
  }

  @Override
  public String answeredBy(Actor actor) {
    return of(mensaje).viewedBy(actor).asString();
  }

  public static ValidarReunionAgendada conLaData(Target message) {
    return new ValidarReunionAgendada(message);
  }
}
