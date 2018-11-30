package cucumber.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.pages.CandidatosPage;

public class CandidatosSteps {

	CandidatosPage pagecandidatos = new CandidatosPage();

	@Given("^que acessei o website$")
	public void que_acessei_o_website() throws Exception {
		pagecandidatos.driver.get("http://ProjetoAplicado");
	}

	@When("^clicar no link candidatos$")
	public void clicar_no_link_candidatos() throws Exception {
		pagecandidatos.linkcandidato().click();
	}
	
	@When("^selecionar presidente$")
	public void selecionar_presidente() throws Exception {
		pagecandidatos.linkpresidente().click();
	}
	
	@Then("^verei todos os candidatos$")
	public void verei_todos_os_candidatos() throws Exception {
		for(WebElement presid : pagecandidatos.presidentes()) {
			String nomes = ((WebElement) pagecandidatos.presidentes()).getText();
			assertTrue(presid.isDisplayed());
			System.out.println(nomes);
		}
	}
	
	@When("^selecionar o candidato \\\"([^\\\"]*)\\\"$")
	public void selecionar_o_candidato(String nome) throws Exception {
		for(WebElement presid : pagecandidatos.presidentes()) {
			String nomes = ((WebElement) pagecandidatos.presidentes()).getText();
			if (nomes == nome) {
				presid.click();
			}
		}
	}
	
	

}
