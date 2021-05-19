package br.com.braseg.consultas.steps;

import org.openqa.selenium.WebDriver;

import br.com.braseg.config.consultas.ChromeUsuarioLiberado;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;


public class UsuarioSemPermissaoEnviarMensagemBDD extends ChromeUsuarioLiberado{

	WebDriver driver;

	//## Contexto ## 
	    @Dado("^que estou acessando o sistema LEXWeb com perfil restrito$")
	    public void queAcessoSistemaLEXWeb() {
	    	this.usuarioLiberadoLex();
	    }

	    @Quando("^seleciono a opcao Numero Dossie no campo Consulta por com perfil restrito$")
	    public void clicarNoConsultaPor() throws Throwable {
	    	this.campoConsultaPor();
	    }
	    
	    @E("^seleciono a opcao Contem no campo Tipo de Operacao com perfil restrito$")
	    public void clicarNoTipoDeOperacao() throws Throwable {
	    	this.campoConsultaPor();
	    }
	    
	    @E("^Digito os dados no campo Conteudo com perfil restrito$")
	    public void clicarNoConteudo() throws Throwable {
	    	this.campoConteudo();
	    }
	    
	    @E("^Clico no botao Consultar com perfil restrito$")
	    public void clicarBtnConsultar() throws Throwable {
	    	this.btnConsultar();
	    }
	    
	    @Então("^visualizo o resultado na grid com perfil restrito$")
	    public void visualisoConsulta() throws Throwable {
	    	this.resultadoGrid();
	    }

	  //## Cenário 2 da Sprint 11 ##     
	    @Quando("^clico no botao Alterar Dossie de qualquer dossie com perfil restrito$")
	    public void clicarBtnAlterarDossie() throws Throwable {
	    	this.btnAlterar();
	    }
	    
	    @E("^visualizo a tela de Alteracao Dossie com todos os campos editaveis com perfil restrito$")
	    public void visualisoTelaAlterarDossie() throws Throwable {
	    	this.alteracaoDossie();
	    }
	    
	    @E("^visualiso os botoes Mensagem e Solicita Subsidios desabilitados$")
	    public void visualisoBtnsMensagemESolSub() throws Throwable {
	    	this.alteracaoDossie();
	    }
	    
	    @Então("^nao tenho permissao para enviar mensagem e solicitar subsidios$")
	    public void semPermissaoEnviarESolicitar() throws Throwable {
	    	this.resultadoGrid();
	    }

}