package co.com.chocairtesting.certification.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/CrearUnidadNegocio.feature",
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    glue = {
      "co.com.chocairtesting.certification.test.stepdefinitions",
    })
public class CrearUnidadNegocio {}
