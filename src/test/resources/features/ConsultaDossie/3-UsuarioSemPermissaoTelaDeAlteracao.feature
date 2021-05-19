#language: pt

@funcionais
Funcionalidade: Funcionario ou terceiro restrito a acessar a tela de alteracao 
  Como funcionario Bradesco Seguro ou terceiro, ativo no sistema e com restricoes
  Gostaria de logar no sistema LEXWeb3.0
  Para que eu nao possa ter acesso a tela de alteracao
  
 Contexto: Logar no sistema LEXWeb 3.0
   Dado que estou acessando o sistema LEXWeb com perfil restrito a tela de alteracao
   Quando seleciono a opcao Numero Dossie no campo Consulta por com restricao a tela de alteracao
   E seleciono a opcao Contem no campo Tipo de Operacao com restricao a tela de alteracao
   E Digito os dados no campo Conteudo com restricao a tela de alteracao
   E Clico no botao Consultar com restricao a tela de alteracao
   Entao visualizo o resultado na grid com o botao Alterar desabilitado
    
Cenario: Verificar se o botao Alterar esta desabilitado
	 Quando clico no botao Alterar Dossie desabilitado de qualquer dossie  
	 Entao não tenho permissao para alterar nenhum dossie
	