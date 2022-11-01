package co.com.chocairtesting.certification.test.userinterface;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

import net.serenitybdd.screenplay.targets.Target;

public final class AgendarReunionPage {
  public static final Target BTN_NUEVA_REUNION =
      Target.the("Crear nueva reunión").located(xpath("//*[text()=' New Meeting']"));

  public static final Target TXT_NOMBRE_REUNION =
      Target.the("Ingresar nombre de la reunión")
          .located(xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingName\"]"));
  public static final Target LBL_TIPO_REUNION =
      Target.the("Desplegar Lista de tipo de reuniones").located(id("select2-chosen-6"));
  public static final Target LBL_BUSCAR_TIPO_REUNION =
      Target.the("Ingresar tipo de reunion").located(id("s2id_autogen6_search"));
  public static final Target LBL_FECHA_INICIO =
      Target.the("Ingresar Fecha inicio")
          .located(id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));
  public static final Target LBL_FECHA_FIN =
      Target.the("Ingresar Fecha fin").located(id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));
  public static final Target LST_UBICACION =
      Target.the("Desplegar Lista de ubicaciones").located(id("select2-chosen-7"));
  public static final Target TXT_BUSCAR_UBICACION =
      Target.the("Seleccionar ubicacion").located(id("s2id_autogen7_search"));
  public static final Target LST_ORGANIZADOR =
      Target.the("Desplegar lista de organizador").located(id("select2-chosen-9"));
  public static final Target TXT_BUSCAR_ORGANIZADOR =
      Target.the("Seleccionar organizador").located(id("s2id_autogen9_search"));
  public static final Target LST_ASISTENTES =
      Target.the("Desplegar lista de asistentes").located(id("select2-chosen-12"));
  public static final Target TXT_BUSCAR_ASISTENTES =
      Target.the("Seleccionar Asistentes").located(id("s2id_autogen12_search"));
  public static final Target TXT_NUMERO_REUNION =
      Target.the("Ingresar numero de reunión")
          .located(id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));
  public static final Target LST_UNIDAD =
      Target.the("Desplegar lista de unidades").located(id("select2-chosen-8"));
  public static final Target TXT_BUSCAR_UNIDAD =
      Target.the("Seleccionar Unidad").located(id("s2id_autogen8_search"));
  public static final Target LST_REPORTERO =
      Target.the("Desplegar lista de reporteros").located(id("select2-chosen-10"));
  public static final Target TXT_REPORTERO =
      Target.the("Seleccionar Reportero").located(id("s2id_autogen10_search"));
  public static final Target TXT_BUSCAR_REUNION_AGENDADA =
      Target.the("Buscar Reunion Agendada")
          .located(xpath("//*[@id=\"GridDiv\"]//*[@placeholder=\"search...\"]"));
  public static final Target LBL_REUNION_AGENDADA =
      Target.the("Validar Reunion Agendada")
          .located(xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div/div[2]/a"));

  private AgendarReunionPage() {}
}
