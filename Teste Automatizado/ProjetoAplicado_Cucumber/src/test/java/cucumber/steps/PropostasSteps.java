package cucumber.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;
import cucumber.pages.PropostasPage;

public class PropostasSteps {
	
	PropostasPage pagepropostas = new PropostasPage();
	
	@When("^clicar no link propostas$")
	public void clicar_no_link_propostas() throws Exception {
		pagepropostas.linkpropostas().click();
	}
	
	@When("^será apresentada suas propostas$")
	public void sera_apresentada_suas_propostas() throws Exception {
		for(WebElement prop : pagepropostas.propostas()) {
			assertTrue(prop.isDisplayed());
		}
	}
	
}
	

