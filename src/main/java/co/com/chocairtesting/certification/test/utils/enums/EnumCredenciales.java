package co.com.chocairtesting.certification.test.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumCredenciales {
  STARTSHARP("admin", "serenity");

  private final String usuario;
  private final String clave;
}
