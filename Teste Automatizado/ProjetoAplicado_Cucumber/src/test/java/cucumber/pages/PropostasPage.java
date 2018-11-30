package cucumber.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PropostasPage {
	
	public WebDriver driver;
	
	// Identificando link de propostas
	public WebElement linkpropostas() {
		WebElement link = driver.findElement(By.id("link_propostas"));
		return link;
	}
	
	// Identificando propostas
	public List<WebElement> propostas() {
		List<WebElement> propostas = driver.findElements(By.id("propostas"));
		return propostas;
	}

}
