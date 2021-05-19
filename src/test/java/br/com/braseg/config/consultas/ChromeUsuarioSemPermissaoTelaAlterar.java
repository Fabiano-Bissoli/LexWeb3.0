package br.com.braseg.config.consultas;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.braseg.config.LoginLex;

public class ChromeUsuarioSemPermissaoTelaAlterar extends LoginLex {

	WebDriver driver;
	boolean btn_alterar_dossie;

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

		// ## Validações de páginas ##
		String texto = driver
				.findElement(By.xpath("/html/body/app-root/clr-main-container/app-tela-dossie/div[1]/div/div/div[2]"))
				.getText();
		Assert.assertEquals("Dossiê", texto);
	}

//  ## Campos da tela de Consulta Dossiê ##
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

//	Botão Consultar da tela Consulta Dossiê ##
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
		driver.findElement(By.id("btn-alterar-dossie")).isEnabled();
	}

//	## Botões "Alterar Dossiê" desabilitado ##
	public void btnAlterar() {
		// Botão Alterar Dossiê
		driver.findElement(By.id("btn-alterar-dossie")).isEnabled();
	}

//  ## Clicar nos botões "Alterar Dossiê" ##
	public void semPermissaoBtnAlterarDossie() throws Throwable {
		// Botão Alterar Dossiê
		System.out.println("Clicar no botão Alterar Dossiê");

		btn_alterar_dossie = driver.findElement(By.id("btn-alterar-dossie")).isEnabled();

		if (btn_alterar_dossie = true) {
			driver.findElement(By.id("btn-alterar-dossie")).click();
			System.out.println("Botão Alterar Dossiê habilitado indevidamente!");
			driver.close();
		} else {
			System.out.println("Botão Altarar Dossiê desabilitado com sucesso!");
		}

		driver.close();

	}

}
