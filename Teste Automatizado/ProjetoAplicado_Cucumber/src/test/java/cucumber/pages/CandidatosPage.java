package cucumber.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CandidatosPage {
	
	public WebDriver driver;
	
		// Identificando link de candidatos
		public WebElement linkcandidato() {
			WebElement link = driver.findElement(By.id("link_candidato"));
			return link;
		}
		
		// Identificando link presidente
		public WebElement linkpresidente() {
			WebElement linkpresid = driver.findElement(By.id("link_presidente"));
			return linkpresid;
		}
		
		// Todos Presidentes
		public List<WebElement> presidentes() {
			List<WebElement> presidentes = driver.findElements(By.id("presidentes"));
			return presidentes;
		}
		
		// Identificando Info Presidente
		public WebElement infopresidente() {
			WebElement info = driver.findElement(By.id("det_presid"));
			return info;
		}

}
