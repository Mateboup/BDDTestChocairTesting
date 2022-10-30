package co.com.chocairtesting.certification.test.userinterface;

import static org.openqa.selenium.By.id;

import net.serenitybdd.screenplay.targets.Target;

public final class IniciarSesion {
  public static final Target TXT_USUARIO =
      Target.the("Ingresar usuario").located(id("LoginPanel0_Username"));
  public static final Target TXT_CLAVE =
      Target.the("Ingresar clave").located(id("LoginPanel0_Password"));
  public static final Target BTN_REGISTRARSE =
      Target.the("Botón iniciar sesión").located(id("LoginPanel0_LoginButton"));

  private IniciarSesion() {}
}
