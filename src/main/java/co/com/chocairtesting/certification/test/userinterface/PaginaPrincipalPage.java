package co.com.chocairtesting.certification.test.userinterface;

import static org.openqa.selenium.By.xpath;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaPrincipalPage {
  public static final Target LBL_ORGANIZACION =
      Target.the("Seleccionar organización").located(xpath("//*[text()='Organization']"));
  public static final Target LBL_UNIDAD_NEGOCIO =
      Target.the("Seleccionar unidades de negocio")
          .located(xpath("//*[@id=\"nav_menu1_3_1\"]//*[text()='Business Units']"));

  public static final Target BTN_GUARDAR =
      Target.the("Click Botón guardar nueva unidad de negocio")
          .located(xpath("//*[text()=' Save']"));

  public static final Target LBL_REUNION =
      Target.the("Entrar al menú reunión").located(xpath("//*[text()='Meeting']"));

  public static final Target LBL_AGENDAR_REUNION =
      Target.the("Entrar a la opción para agendar reuiones")
          .located(xpath("//*[@id=\"nav_menu1_3_2\"]//*[text()='Meetings']"));

  private PaginaPrincipalPage() {}
}
