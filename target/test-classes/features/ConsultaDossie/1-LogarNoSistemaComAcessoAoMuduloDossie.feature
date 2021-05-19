#language: pt

@funcionais
Funcionalidade: Funcionario ou terceiro com a acesso ao modulo Dossie
  Como funcionario Bradesco Seguro ou terceiro, ativo no sistema
  Gostaria de Alterar ou Visualizar o grupo Campos Adicionais da tela de Dossie
  Para que eu possa Alterar dados dos processos judiciais
  
 Contexto: Logar no sistema LEXWeb 3.0
   Dado que estou acessando o sistema LEXWeb
   Quando seleciono a opcao Numero Dossie no campo Consulta por
   E seleciono a opcao Contem no campo Tipo de Operacao
   E Digito os dados no campo Conteudo
   E Clico no botao Consultar 
   Entao visualizo o resultado na grid
    
Cenario: Verificar tela de Alteracao Dossie com os campos editaveis
	 Quando clico no botao Alterar Dossie de qualquer dossie
	 Entao visualizo a tela de Alteracao Dossie com todos os campos editaveis
	