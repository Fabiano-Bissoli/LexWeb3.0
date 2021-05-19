package br.com.braseg.config.consultas;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.braseg.config.LoginLex;

public class ChromeExpansaoERetracaoDosGrupos extends LoginLex {

	WebDriver driver;

	public void usuarioLiberadoLex() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//fbissoli//eclipse-workspace//LexWeb3.0//drivers//chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(LoginLex.URL);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		driver.findElement(By.name("matricula")).sendKeys(LoginLex.MATRICULA_UM);
		driver.findElement(By.name("senha")).sendKeys(LoginLex.SENHA_UM);
		driver.findElement(By.xpath(
				"/html/body/app-root/clr-main-container/app-login/section/div/div/div/div/div[2]/form/div[3]/div/div/button"))
				.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ex) {
		}

		// ## Valida��es de p�ginas ##
		String texto = driver
				.findElement(By.xpath("/html/body/app-root/clr-main-container/app-tela-dossie/div[1]/div/div/div[2]"))
				.getText();
		Assert.assertEquals("Dossi�", texto);
	}

//  ## Campos da tela de Consulta Dossi� ##
	public void campoConsultaPor() {
		driver.findElement(By.id("consulta-por")).click();
		driver.findElement(By.xpath("//*[@id=\"consulta-por\"]/option[1]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
	}

	public void campoTipoDeOperacao() {
		driver.findElement(By.id("tipo-operacao")).click();
		driver.findElement(By.xpath("//*[@id=\"tipo-operacao\"]/option[2]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
	}

	public void campoConteudo() {
		driver.findElement(By.id("conteudo-text")).sendKeys("2021/0");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
	}

//	Bot�o Consultar da tela Consulta Dossi� ##
	public void btnConsultar() {
		driver.findElement(By.id("btn-consultar")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
	}

//  Resultado exibido na Grid ##
	public void resultadoGrid() {
		String texto = driver.findElement(By.xpath("//*[@id=\"column-header-departamento\"]/div/button")).getText();
		Assert.assertEquals("Departamento", texto);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}
	}

//  
	public void btnAlterar() {
		driver.findElement(By.id("btn-alterar-dossie")).click();
	}

//  ## Tela Altera��o Dossi� ##	
	public void alteracaoDossie() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException ex) {
		}

		// Validando a tela Alterar Dossi�
		String texto = driver
				.findElement(By
						.xpath("/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[1]/div/div/div[2]"))
				.getText();
		texto.contains("Dossi�");
	}

	// Expans�o e retra��o do grupo Campos Principais
	public void clicarGrupoCamposPrincipais() {
		driver.findElement(By.id("btn-consultar")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}

	}

	public void validacaoExpansaoCamposPrincipais() {
//		## Valida��o da exibi��o dos campos do grupo Campos Principais ##

		// Campo N� Dossie
		String numeroDossie = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[1]/div[1]/label"))
				.getText();
		numeroDossie.contains("N� Dossi�");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[1]/div[1]/label"))
				.isDisplayed();

		// Campo Data de Abertura
		String dataDeAbertura = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[1]/div[2]/label"))
				.getText();
		dataDeAbertura.contains("Data de Abertura");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[1]/div[2]/label"))
				.isDisplayed();

		// Campo Status
		String status = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[1]/div[3]/label"))
				.getText();
		status.contains("Status");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[1]/div[3]/label"))
				.isDisplayed();

		// Campo Tipo
		String tipo = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[2]/div[1]/label"))
				.getText();
		tipo.contains("Tipo");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[2]/div[1]/label"))
				.isDisplayed();

		// Campo Modalidade
		String modalidade = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[2]/div[2]/label"))
				.getText();
		modalidade.contains("Modalidade");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[2]/div[2]/label"))
				.isDisplayed();

		// Campo Ger�ncia
		String gerencia = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[2]/div[3]/label"))
				.getText();
		gerencia.contains("Ger�ncia");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[2]/div[3]/label"))
				.isDisplayed();

		// Campo Empresa
		String empresa = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[3]/div[1]/label"))
				.getText();
		empresa.contains("Empresa");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[3]/div[1]/label"))
				.isDisplayed();

		// Campo Valor da Causa
		String valorDaCausa = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[3]/div[2]/label"))
				.getText();
		valorDaCausa.contains("Valor da Causa");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[3]/div[2]/label"))
				.isDisplayed();

		// Campo Posi��o
		String posicao = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[4]/div[1]/label"))
				.getText();
		posicao.contains("Posi��o");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[4]/div[1]/label"))
				.isDisplayed();

		// Campo Unidade de Neg�cio
		String unidadeDeNegocio = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[4]/div[2]/label"))
				.getText();
		unidadeDeNegocio.contains("Unidade de Neg�cio");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[4]/div[2]/label"))
				.isDisplayed();

		// Campo Departamento
		String departamento = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[4]/div[3]/label"))
				.getText();
		departamento.contains("Departamento");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[4]/div[3]/label"))
				.isDisplayed();

		// Campo Natureza
		String natureza = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[5]/div/label"))
				.getText();
		natureza.contains("Natureza");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[5]/div/label"))
				.isDisplayed();

		// Campo Tipo de A��o
		String tipoDeAcao = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[6]/div/label"))
				.getText();
		tipoDeAcao.contains("Tipo de A��o");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[6]/div/label"))
				.isDisplayed();

		// Campo Processo
		String processo = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[7]/div[1]/label"))
				.getText();
		processo.contains("Processo");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[7]/div[1]/label"))
				.isDisplayed();

		// Campo Processo Administrativo
		String processoAdministrativo = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[7]/div[2]/label"))
				.getText();
		processoAdministrativo.contains("Processo Administrativo");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[7]/div[2]/label"))
				.isDisplayed();

		// Campo Data de Distribui��o
		String dataDeDistribuicao = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[8]/div[1]/label"))
				.getText();
		dataDeDistribuicao.contains("Data de Distribui��o");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[8]/div[1]/label"))
				.isDisplayed();

		// Campo Data da Peti��o
		String dataDaPeticao = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[8]/div[2]/label"))
				.getText();
		dataDaPeticao.contains("Data da Peti��o");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[8]/div[2]/label"))
				.isDisplayed();

		// Campo Data da Cita��o
		String dataDaCitacao = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[8]/div[3]/label"))
				.getText();
		dataDaCitacao.contains("Data da Cita��o");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[8]/div[3]/label"))
				.isDisplayed();

		// Campo Objeto
		String objeto = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[9]/div[1]/div/div[1]/div"))
				.getText();
		objeto.contains("Objeto");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[9]/div[1]/div/div[1]/div"))
				.isDisplayed();

		// Campo Observa��es
		String observacoes = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[9]/div[2]/label"))
				.getText();
		observacoes.contains("Observa��es");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[9]/div[2]/label"))
				.isDisplayed();

		// Campo Vara/Juizado
		String varaJuizado = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[10]/div[1]/label"))
				.getText();
		varaJuizado.contains("Vara/Juizado");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[10]/div[1]/label"))
				.isDisplayed();

		// Campo Org�o
		String orgao = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[10]/div[2]/label"))
				.getText();
		orgao.contains("Org�o");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[10]/div[2]/label"))
				.isDisplayed();

		// Campo Comarca
		String comarca = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[10]/div[3]/label"))
				.getText();
		comarca.contains("Comarca");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[10]/div[3]/label"))
				.isDisplayed();

		// Campo N� Sinistro
		String numeroSinistro = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[11]/div[1]/label"))
				.getText();
		numeroSinistro.contains("N� Sinistro");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[11]/div[1]/label"))
				.isDisplayed();

		// Campo Data do Sinistro
		String dataDoSinistro = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[11]/div[2]/label"))
				.getText();
		dataDoSinistro.contains("N� Sinistro");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[11]/div[2]/label"))
				.isDisplayed();

		// Campo Pescri��o
		String prescricao = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[11]/div[3]/label"))
				.getText();
		prescricao.contains("Pescri��o");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[11]/div[3]/label"))
				.isDisplayed();

		// Campo Ramo
		String ramo = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[12]/div[1]/label"))
				.getText();
		ramo.contains("Ramo");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[12]/div[1]/label"))
				.isDisplayed();

		// Campo Sucursal
		String sucursal = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[12]/div[2]/label"))
				.getText();
		sucursal.contains("Sucursal");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[12]/div[2]/label"))
				.isDisplayed();

		// Campo Motivo
		String motivo = driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[12]/div[3]/label"))
				.getText();
		motivo.contains("Motivo");
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[12]/div[3]/label"))
				.isDisplayed();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}


	}
	
	public void validacaoRetracaoCamposPrincipais() {
//		## Valida��o da exibi��o dos campos do grupo Campos Principais ##

		// Campo N� Dossie
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[1]/div[1]/label"))
				.isDisplayed();

		// Campo Data de Abertura
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[1]/div[2]/label"))
				.isDisplayed();

		// Campo Status
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[1]/div[3]/label"))
				.isDisplayed();

		// Campo Tipo
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[2]/div[1]/label"))
				.isDisplayed();

		// Campo Modalidade
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[2]/div[2]/label"))
				.isDisplayed();

		// Campo Ger�ncia
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[2]/div[3]/label"))
				.isDisplayed();

		// Campo Empresa
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[3]/div[1]/label"))
				.isDisplayed();

		// Campo Valor da Causa
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[3]/div[2]/label"))
				.isDisplayed();

		// Campo Posi��o
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[4]/div[1]/label"))
				.isDisplayed();

		// Campo Unidade de Neg�cio
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[4]/div[2]/label"))
				.isDisplayed();

		// Campo Departamento
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[4]/div[3]/label"))
				.isDisplayed();

		// Campo Natureza
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[5]/div/label"))
				.isDisplayed();

		// Campo Tipo de A��o
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[6]/div/label"))
				.isDisplayed();

		// Campo Processo
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[7]/div[1]/label"))
				.isDisplayed();

		// Campo Processo Administrativo
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[7]/div[2]/label"))
				.isDisplayed();

		// Campo Data de Distribui��o
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[8]/div[1]/label"))
				.isDisplayed();

		// Campo Data da Peti��o
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[8]/div[2]/label"))
				.isDisplayed();

		// Campo Data da Cita��o
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[8]/div[3]/label"))
				.isDisplayed();

		// Campo Objeto
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[9]/div[1]/div/div[1]/div"))
				.isDisplayed();

		// Campo Observa��es
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[9]/div[2]/label"))
				.isDisplayed();

		// Campo Vara/Juizado
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[10]/div[1]/label"))
				.isDisplayed();

		// Campo Org�o
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[10]/div[2]/label"))
				.isDisplayed();

		// Campo Comarca
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[10]/div[3]/label"))
				.isDisplayed();

		// Campo N� Sinistro
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[11]/div[1]/label"))
				.isDisplayed();

		// Campo Data do Sinistro
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[11]/div[2]/label"))
				.isDisplayed();

		// Campo Pescri��o
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[11]/div[3]/label"))
				.isDisplayed();

		// Campo Ramo
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[12]/div[1]/label"))
				.isDisplayed();

		// Campo Sucursal
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[12]/div[2]/label"))
				.isDisplayed();

		// Campo Motivo
		driver.findElement(By.xpath(
				"//*[@id=\"clr-accordion-content-clr-id-18-0'\"]/div/div/app-campos-principais/div/div[12]/div[3]/label"))
				.isDisplayed();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}

	}

}
