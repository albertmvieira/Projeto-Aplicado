package old.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import junit.framework.Assert;

public class inserirContasSteps {
	
	private WebDriver driver;
	
	@Dado("^que desejo adicionar uma conta$")
	public void queDesejoAdicionarUmaConta() throws Throwable {
		driver = new ChromeDriver();
	    driver.get("https://srbarriga.herokuapp.com/");
	    driver.findElement(By.id("email")).sendKeys("albert@teste.com");
	    driver.findElement(By.name("senha")).sendKeys("123456");
	    driver.findElement(By.cssSelector("button[type=submit]")).click();
	    driver.findElement(By.linkText("Contas")).click();
	    driver.findElement(By.cssSelector("a[href='/addConta']")).click();
	}

	@Quando("^adiciona a \"([^\"]*)\"$")
	public void adicionaA(String nome) throws Throwable {
		driver.findElement(By.id("nome")).sendKeys(nome);
		driver.findElement(By.tagName("button")).click();
	}
	
	@Dado("^que estou acessando a aplicação$")
	public void queEstouAcessandoAAplicação() throws Throwable {
	    driver = new ChromeDriver();
	    driver.get("https://srbarriga.herokuapp.com/");
	}

	@Quando("^informo o usuário \"([^\"]*)\"$")
	public void informoOUsuário(String email) throws Throwable {
	    driver.findElement(By.id("email")).sendKeys(email);
	}

	@Quando("^a senha \"([^\"]*)\"$")
	public void aSenha(String senha) throws Throwable {
	    driver.findElement(By.name("senha")).sendKeys(senha);
	}

	@Quando("^seleciono entrar$")
	public void selecionoEntrar() throws Throwable {
	    driver.findElement(By.cssSelector("button[type=submit]")).click();
	}

	@Então("^visualizo a página inicial$")
	public void visualizoAPáginaInicial() throws Throwable {
		//Pesquisa por CSS Selector
		//String texto = driver.findElement(By.cssSelector(".alert.alert-success")).getText();
		
		//Pesquisa por XPath
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
	    Assert.assertEquals("Bem vindo, Albert!", texto);
	}

	@Quando("^seleciono Contas$")
	public void selecionoContas() throws Throwable {
	    driver.findElement(By.linkText("Contas")).click();
	    //por css o click não fica aparente na tela, ele click e depois solta - funcionou
		//driver.findElement(By.cssSelector("a[href='/']")).click();
	}

	@Quando("^seleciono Adicionar$")
	public void selecionoAdicionar() throws Throwable {
		//driver.findElement(By.linkText("Adicionar")).click();
		driver.findElement(By.cssSelector("a[href='/addConta']")).click();	
	}

	@Quando("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String nome) throws Throwable {
		driver.findElement(By.id("nome")).sendKeys(nome);
	}

	@Quando("^seleciono Salvar$")
	public void selecionoSalvar() throws Throwable {
	    //Utilizando tag name para encontrar o elemente na tela
		driver.findElement(By.tagName("button")).click();
	}

	@Então("^recebo a mensagem \"([^\"]*)\"$")
	public void receboAMensagem(String msg) throws Throwable {
		//Pesquisa por CSS Selector generalizando para poder pegar qualquer tipo de erro success ou danger
		String texto = driver.findElement(By.cssSelector("div[class^=alert]")).getText();
		
		//Pesquisa por XPath genralizando
		//String texto = driver.findElement(By.xpath("//div[starts-with(@class='alert alert-']")).getText();
		Assert.assertEquals(msg, texto);
	}
	
	//order 0 será o primeiro a ser executada para o before
	@Before(order = 0)
	public void inicio() {
		System.out.println("Começa aqui");
	}
	
	@Before(order = 1)
	public void iniciopartedois() {
		System.out.println("Começa aqui parte 2");
	}
	
	//Imagens serão geradas utilizando o nome do cenário / order 0 será a última a ser executada para o after
	@After(order = 1, value = {"@funcionais"})
	public void screenshot(cucumber.api.Scenario cenario) {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshot/"+cenario.getId()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@After(order = 0, value = {"@funcionais"})
	public void fecharBrowser() {
		driver.quit();
		System.out.println("Termina aqui");
	}
}
