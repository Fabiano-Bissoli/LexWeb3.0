package br.com.braseg.config.consultas;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.braseg.config.LoginLex;

public class ChromeUsuarioSemPermissaoMensagemSolSub extends LoginLex {

	WebDriver driver;
	boolean btn_mensagem;
	boolean btn_solicitar_subsidio;

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

		// ## Valida��o do cabe�alho ##

		// Expandir
		String expandir = driver
				.findElement(By.xpath(
						"/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[1]/div/div/div[3]/a[1]"))
				.getText();
		Assert.assertEquals("Expandir", expandir);

		// Voltar
		String voltar = driver
				.findElement(By.xpath(
						"/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[1]/div/div/div[3]/a[2]"))
				.getText();
		Assert.assertEquals("< Voltar", voltar);

		// Campos Principais
		String principais = driver.findElement(By.xpath(
				"/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[2]/form/clr-accordion/clr-accordion-panel[1]/div/div[1]/button/clr-accordion-title"))
				.getText();
		Assert.assertEquals("Campos Principais", principais);
		// Validando se a exibi��o do grupo Campos Principais est� fechado
		Boolean exibindoPrncipais = driver.findElements(By.xpath(
				"/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[2]/form/clr-accordion/clr-accordion-panel[1]/div/div[2]/div"))
				.size() > 0;
		Assert.assertFalse(exibindoPrncipais);

		// Partes
		String partes = driver.findElement(By.xpath(
				"/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[2]/form/clr-accordion/clr-accordion-panel[2]/div/div[1]/button/clr-accordion-title"))
				.getText();
		Assert.assertEquals("Partes", partes);
		// Validando se a exibi��o do grupo Partes est� fechado
		Boolean exibindoPartes = driver.findElements(By.xpath(
				"/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[2]/form/clr-accordion/clr-accordion-panel[2]/div/div[2]/div/div"))
				.size() > 0;
		Assert.assertFalse(exibindoPartes);

		// Advogados
		String advogados = driver.findElement(By.xpath(
				"/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[2]/form/clr-accordion/clr-accordion-panel[3]/div/div[1]/button/clr-accordion-title"))
				.getText();
		Assert.assertEquals("Advogados", advogados);
		// Validando se a exibi��o do grupo Advogados est� fechado
		Boolean exibindoAdvogados = driver.findElements(By.xpath(
				"/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[2]/form/clr-accordion/clr-accordion-panel[3]/div/div[2]/div"))
				.size() > 0;
		Assert.assertFalse(exibindoAdvogados);

		// Complemento
		String complemento = driver.findElement(By.xpath(
				"/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[2]/form/clr-accordion/clr-accordion-panel[4]/div/div[1]/button/clr-accordion-title"))
				.getText();
		Assert.assertEquals("Complemento", complemento);
		// Validando se a exibi��o do grupo Complemento est� fechado
		Boolean exibindoComplemento = driver.findElements(By.xpath(
				"/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[2]/form/clr-accordion/clr-accordion-panel[4]/div/div[2]/div/div/clr-accordion-content/app-complemento-dossie/div/div/div"))
				.size() > 0;
		Assert.assertFalse(exibindoComplemento);

		// Campos Adicionais
		String adicionais = driver.findElement(By.xpath(
				"/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[2]/form/clr-accordion/clr-accordion-panel[5]/div/div[1]/button/clr-accordion-title"))
				.getText();
		Assert.assertEquals("Campos Adicionais", adicionais);
		// Validando se a exibi��o do grupo Campos Adicionais est� fechado
		Boolean exibindoAdicionais = driver.findElements(By.xpath(
				"/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[2]/form/clr-accordion/clr-accordion-panel[5]/div/div[2]/div"))
				.size() > 0;
		Assert.assertFalse(exibindoAdicionais);

		// Usu�rio �ltima Altera��o
		String responssavel = driver.findElement(By
				.xpath("/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[2]/div/div/span/strong[1]"))
				.getText();
		Assert.assertEquals("Usu�rio �ltima Altera��o:", responssavel);

		// Data/Hora Alterada
		String data = driver.findElement(By
				.xpath("/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[2]/div/div/span/strong[2]"))
				.getText();
		Assert.assertEquals("Data e Hora:", data);

		// Bot�o Alterar
		driver.findElement(By.id("btn-gravar")).isEnabled();

		// Bot�o Cancelar
		driver.findElement(By.id("btn-cancelar")).isEnabled();

		driver.quit();
	}

//	## Bot�es "Mensagem" e "Solicitar Subs�dios" sem permiss�o ##	
	public void visualisoBtnsMensagemESolSub() {
		// Bot�o Mensagem
		driver.findElement(By.id("btn-mensagem")).isEnabled();

		// Bot�o Solicitar Subs�dios
		driver.findElement(By.id("btn-solicitar-dossie")).isEnabled();
	}

//  ## Clicar nos bot�es "Mensagem" e "Solicitar Subs�dios" ##
	public void semPermissaoEnviarESolicitar() throws Throwable {
		// Bot�o Mensagem
		System.out.println("Clicar no bot�o Mensagem");

		btn_mensagem = driver.findElement(By.id("btn-mensagem")).isEnabled();

		if (btn_mensagem = false) {
			driver.findElement(By.id("btn-mensagem")).click();
			System.out.println("Bot�o Mensagem habilitado indevidamente!");
			driver.close();
		} else {
			System.out.println("Bot�o Mensagem desabilitado com sucesso!");
		}

		btn_solicitar_subsidio = driver.findElement(By.id("btn-solicitar-dossie")).isEnabled();

		if (btn_solicitar_subsidio = true) {
			driver.findElement(By.id("btn-mensagem")).click();
			System.out.println("Bot�o Solicitar Subs�dio habilitado indevidamente!");
			driver.close();
		} else {
			System.out.println("Bot�o Solicitar Subs�dio desabilitado com sucesso!");
		}

		driver.close();
	}

}
