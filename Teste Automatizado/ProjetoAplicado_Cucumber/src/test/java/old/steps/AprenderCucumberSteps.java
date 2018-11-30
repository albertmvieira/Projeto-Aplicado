package old.steps;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.converters.DateConverter;

public class AprenderCucumberSteps {
	
/*	--------------- Sem CAMELCASE ----------------------------------------- 
 * @Given("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {

	}

	@When("^executá-lo$")
	public void executá_lo() throws Throwable {

	}

	@Then("^a especificação deve executar corretamente$")
	public void a_especificação_deve_executar_corretamente() throws Throwable {

	}*/
	
	@Given("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
	}

	@When("^executá-lo$")
	public void executáLo() throws Throwable {
	}

	@Then("^a especificação deve executar corretamente$")
	public void aEspecificaçãoDeveExecutarCorretamente() throws Throwable {
	}
	
	private int contador = 0;
	
	@Given("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int arg1) throws Throwable {
		contador = arg1;
	}

	@When("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
		contador = contador + arg1;
	}

	@Then("^o valor do contador será (\\d+)$")
	public void oValorDoContadorSerá(int arg1) throws Throwable {
//		System.out.println(arg1);
//		System.out.println(contador);
//		System.out.println(arg1 == contador);
//		Assert.assertTrue(arg1 == contador);  //metodo assert para validação
		Assert.assertEquals(arg1, contador); //metodo assert para validação de iguais (facilita no retorno do erro, pois mostra o esperado e obtido)
	}
	
	Date entrega = new Date();
	
/*	 //Usando Calendar para resolver a data
	@Given("^que a entrega é dia (\\d+)/(\\d+)/(\\d+)$")
	public void queAEntregaÉDia(int dia, int mes, int ano) throws Throwable {
	    Calendar cal = Calendar.getInstance(); // Metodo do java para trabalhar com datas
	    cal.set(Calendar.DAY_OF_MONTH, dia); // seta o dia pegando da varialvel dia
	    cal.set(Calendar.MONTH, mes - 1); // seta o mes pegando da varialvel mes, necessário colocar - 1 pois o java inicia o mes com 0 para janeiro
	    cal.set(Calendar.YEAR, ano); // seta o ano pegando da varialvel ano
	    entrega = cal.getTime(); // atribuindo para a variavel dia que é uma data o valor da calendario
	}
*/
	// Usando Transform, criando classe para auxiliar a converter
	@Given("^que a entrega é dia (.*)$")
	// necessário informar ao cucumber que será a classe DateConverter do Transforme que sera responsavel por converter a string de data em tipo date
	public void queAEntregaÉDia(@Transform(DateConverter.class) Date data) throws Throwable {
	    entrega = data;
	    System.out.println(entrega);
	}
	
	@When("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmDias(int arg1, String tempo) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if(tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);
		}
		if(tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1);
		}
		entrega = cal.getTime();
	}

	@Then("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$") // alterado mapeamento para ficar a data em apenas uma variavel
	public void aEntregaSeráEfetuadaEm(String data) throws Throwable {
	    DateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // Instanciando a variavel format do tipo DateFormat
	    String dataFormata = format.format(entrega); // Convertento a variavel entrega para data formatada
	    Assert.assertEquals(data, dataFormata); // comparando os valores
	}
	
	
	@Given("^que o ticket( especial)? é (A.\\d{3})$")
	public void queOTicketÉAF(String tipo, String arg1) throws Throwable {

	}

	@Given("^que o valor da passagem é R\\$ (.*)$")
	public void queOValorDaPassagemÉR$(Double numero) throws Throwable {
		System.out.println(numero);
	}

	@Given("^que o nome do passageiro é \"(.{5,20})\"$")
	public void queONomeDoPassageiroÉ(String arg1) throws Throwable {
		
	}

	@Given("^que o telefone do passageiro é (9\\d{3})-(\\d{4})$")
	public void queOTelefoneDoPassageiroÉ(int arg1, int arg2) throws Throwable {
		
	}

	@When("^criar os steps$")
	public void criarOsSteps() throws Throwable {
		
	}

	@Then("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {
		
	}

	
}

