package br.com.braseg.consultas.steps;

import org.openqa.selenium.WebDriver;

import br.com.braseg.config.consultas.ChromeUsuarioLiberado;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;


public class UsuarioSemPermissaoTelaAlteracaoBDD extends ChromeUsuarioLiberado{

	WebDriver driver;

	//## Contexto ## 
	    @Dado("^que estou acessando o sistema LEXWeb com perfil restrito a tela de alteracao$")
	    public void queAcessoSistemaLEXWeb() {
	    	this.usuarioLiberadoLex();
	    }

	    @Quando("^seleciono a opcao Numero Dossie no campo Consulta por com restricao a tela de alteracao$")
	    public void clicarNoConsultaPor() throws Throwable {
	    	this.campoConsultaPor();
	    }
	    
	    @E("^seleciono a opcao Contem no campo Tipo de Operacao com restricao a tela de alteracao$")
	    public void clicarNoTipoDeOperacao() throws Throwable {
	    	this.campoConsultaPor();
	    }
	    
	    @E("^Digito os dados no campo Conteudo com restricao a tela de alteracao$")
	    public void clicarNoConteudo() throws Throwable {
	    	this.campoConteudo();
	    }
	    
	    @E("^Clico no botao Consultar com restricao a tela de alteracao$")
	    public void clicarBtnConsultar() throws Throwable {
	    	this.btnConsultar();
	    }
	    
	    @Então("^visualizo o resultado na grid com o botao Alterar desabilitado$")
	    public void visualisoConsulta() throws Throwable {
	    	this.resultadoGrid();
	    }

	  //## Cenário 3 da Sprint 11 ##     
	    @Quando("^clico no botao Alterar Dossie desabilitado de qualquer dossie$")
	    public void clicarBtnAlterarDossie() throws Throwable {
	    	this.btnAlterar();
	    }
	    
	    @Então("^nao tenho permissao para alterar nenhum dossie$")
	    public void semPermissaoBtnAlterarDossie() throws Throwable {
	    	this.resultadoGrid();
	    }
	    

}