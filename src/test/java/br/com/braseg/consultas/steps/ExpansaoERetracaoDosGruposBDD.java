package br.com.braseg.consultas.steps;

import org.openqa.selenium.WebDriver;

import br.com.braseg.config.consultas.ChromeExpansaoERetracaoDosGrupos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ExpansaoERetracaoDosGruposBDD extends ChromeExpansaoERetracaoDosGrupos {
	
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
    
    @E("^visualizo o resultado na grid$")
    public void visualisoConsulta() throws Throwable {
    	this.resultadoGrid();
    }
    
    @Quando("^clico no botao Alterar Dossie de qualquer dossie$")
    public void clicarBtnAlterarDossie() throws Throwable {
    	this.btnAlterar();
    }
    
    @Então("^visualizo a tela de Alteracao Dossie com todos os campos editaveis$")
    public void visualisoTelaAlterarDossie() throws Throwable {
    	this.alteracaoDossie();
    }

  //## Cenário: Verificar expansao e retracao do grupo Campos Principais - Sprint 11 ##     
    @Quando("^clico no grupo Campos Principais para expandir$")
    public void grupoCamposPrincipais() throws Throwable {
    	this.clicarGrupoCamposPrincipais();
    }
    
    @E("^o grupo Campos Principais se expande exibindo os campos$")
    public void expanaoGrupoCamposPrincipais() throws Throwable {
    	this.validacaoExpansaoCamposPrincipais();
    }
    
    @E("^clico no grupo Campos Principais para retrair$")
    public void expancaoGrupoCamposPrincipais() throws Throwable {
    	this.clicarGrupoCamposPrincipais();
    }
    
    @Então("^o grupo Campos Principais se retrai ocultando os campos$")
    public void retracaoGrupoCamposPrincipais() throws Throwable {
    	this.validacaoExpansaoCamposPrincipais();
    }
    
  //## Cenário: Verificar expansao e retracao do grupo Partes - Sprint 11 ##     
    @Quando("^clico no grupo Partes para expandir$")
    public void clicarGrupoPartes() throws Throwable {
    	this.btnAlterar();
    }
    
    @E("^o grupo Partes se expande exibindo os campos$")
    public void expanaoGrupoPartes() throws Throwable {
    	this.resultadoGrid();
    }
    
    @E("^clico no grupo Partes para retrair$")
    public void expancaoGrupoPartes() throws Throwable {
    	this.resultadoGrid();
    }
    
    @Então("^o grupo Partes se retrai ocultando os campos$")
    public void retracaoGrupoPartes() throws Throwable {
    	this.alteracaoDossie();
    }
    
  //## Cenário: Verificar expansao e retracao do grupo Advogados ##     
    @Quando("^clico no grupo Advogados para expandir$")
    public void clicarGrupoAdvogados() throws Throwable {
    	this.btnAlterar();
    }
    
    @E("^o grupo Advogados se expande exibindo os campos$")
    public void expanaoGrupoAdvogados() throws Throwable {
    	this.resultadoGrid();
    }
    
    @E("^clico no grupo Advogados para retrair$")
    public void expancaoGrupoAdvogados() throws Throwable {
    	this.resultadoGrid();
    }
    
    @Então("^o grupo Advogados se retrai ocultando os campos$")
    public void retracaoAdvogados() throws Throwable {
    	this.alteracaoDossie();
    }
    
  //## Cenário: Verificar expansao e retracao do grupo Complemento ##     
    @Quando("^clico no grupo Complemento para expandir$")
    public void clicarGrupoComplemento() throws Throwable {
    	this.btnAlterar();
    }
    
    @E("^o grupo Complemento se expande exibindo os campos$")
    public void expanaoGrupoComplemento() throws Throwable {
    	this.resultadoGrid();
    }
    
    @E("^clico no grupo Complemento para retrair$")
    public void expancaoGrupoComplemento() throws Throwable {
    	this.resultadoGrid();
    }
    
    @Então("^o grupo Complemento se retrai ocultando os campos$")
    public void retracaoComplemento() throws Throwable {
    	this.alteracaoDossie();
    }
    
  //## Cenário: Verificar expansao e retracao do grupo Campos Adicionais ##     
    @Quando("^clico no grupo Campos Adicionais para expandir$")
    public void clicarGrupoCamposAdicionais() throws Throwable {
    	this.btnAlterar();
    }
    
    @E("^o grupo Campos Adicionais se expande exibindo os campos$")
    public void expanaoGrupoCamposAdicionais() throws Throwable {
    	this.resultadoGrid();
    }
    
    @E("^clico no grupo Campos Adicionais para retrair$")
    public void expancaoGrupoCamposAdicionais() throws Throwable {
    	this.resultadoGrid();
    }
    
    @Então("^o grupo Campos Adicionais se retrai ocultando os campos$")
    public void retracaoCamposAdicionais() throws Throwable {
    	this.alteracaoDossie();
    }
}