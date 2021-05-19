package br.com.braseg.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/ConsultaDossie",
        glue = {"br.com.braseg.consultas.steps", "br.com.braseg.inclusoes.steps", "br.com.braseg.config"},
        tags = {"@funcionais"},
        plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
        monochrome = false,
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = false
		)

public class RunnerConsultaDossieCompleto {
	
}
