package co.com.chocairtesting.certification.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarReunionAgendada implements Question {
  private Target message;

  public ValidarReunionAgendada(Target message) {
    this.message = message;
  }

  @Override
  public Object answeredBy(Actor actor) {
    return actor.recall("POST_SUCCESSFUL").equals(" Why Fintech in Latin America Is Having a Boom");
  }

  public static ValidarReunionAgendada conLaData(Target message) {
    return new ValidarReunionAgendada(message);
  }
}
