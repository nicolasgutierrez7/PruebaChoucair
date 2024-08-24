package com.repaso.ciencuadras.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/repaso.feature",
        tags = "@registro",
        glue="com.repaso.ciencuadras.stepdefinitions",
        monochrome = true)
public class repasoRunner {
}
