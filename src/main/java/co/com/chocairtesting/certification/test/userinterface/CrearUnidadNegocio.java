package co.com.chocairtesting.certification.test.userinterface;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

import net.serenitybdd.screenplay.targets.Target;

public final class CrearUnidadNegocio {
  public static final Target LBL_NUEVA_UNIDAD_NEGOCIO =
      Target.the("Crear nueva unidad de negocio")
          .located(xpath("//*[text()=' New Business Unit']"));
  public static final Target TXT_NOMBRE_NUEVA_UNIDAD =
      Target.the("Nombrar nueva unidad de negocio")
          .located(id("Serenity_Pro_Organization_BusinessUnitDialog3_Name"));
  public static final Target LST_UNIDADES =
      Target.the("Lista para seleccionar unidades").located(id("select2-chosen-1"));

  public static final Target TXT_BUSCAR_UNIDADES =
      Target.the("Lista para seleccionar unidades")
          .located(xpath("//*[@id=\"s2id_autogen1_search\"]"));

  private CrearUnidadNegocio() {}
}
