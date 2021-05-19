package br.com.braseg.consultas.steps;

import org.openqa.selenium.WebDriver;

import br.com.braseg.config.consultas.ChromeUsuarioLiberado;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class UserLiberadoBDD extends ChromeUsuarioLiberado {
	
    WebDriver driver;

//## Contexto ## 
    @Dado("^que estou acessando o sistema LEXWeb$")
    public void queAcessoSistemaLEXWeb() {
    	this.usuarioLiberadoLex();
    }

    @Quando("^seleciono a opcao Numero Dossie no campo Consulta por$")
    public void clicarNoConsultaPor() throws Throwable {
    	this.campoConsultaPor();
    }
    
    @E("^seleciono a opcao Contem no campo Tipo de Operacao$")
    public void clicarNoTipoDeOperacao() throws Throwable {
    	this.campoConsultaPor();
    }
    
    @E("^Digito os dados no campo Conteudo$")
    public void clicarNoConteudo() throws Throwable {
    	this.campoConteudo();
    }
    
    @E("^Clico no botao Consultar$")
    public void clicarBtnConsultar() throws Throwable {
    	this.btnConsultar();
    }
    
    @Então("^visualizo o resultado na grid$")
    public void visualisoConsulta() throws Throwable {
    	this.resultadoGrid();
    }

  //## Cenário 1 da Sprint 11 ##     
    @Quando("^clico no botao Alterar Dossie de qualquer dossie$")
    public void clicarBtnAlterarDossie() throws Throwable {
    	this.btnAlterar();
    }
    
    @Então("^visualizo a tela de Alteracao Dossie com todos os campos editaveis$")
    public void visualisoTelaAlterarDossie() throws Throwable {
    	this.alteracaoDossie();
    }
    
}