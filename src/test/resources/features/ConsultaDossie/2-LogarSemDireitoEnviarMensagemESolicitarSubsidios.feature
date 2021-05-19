#language: pt

@funcionais
Funcionalidade: Funcionario ou terceiro restrito enviar mensagem e solicitar subsidio 
  Como funcionario Bradesco Seguro ou terceiro, ativo no sistema e com restricoes
  Gostaria de logar no sistema LEXWeb3.0
  Para que eu nao possa enviar mensagem e nem solicitar subsidio
  
 Contexto: Logar no sistema LEXWeb 3.0
   Dado que estou acessando o sistema LEXWeb com perfil restrito
   Quando seleciono a opcao Numero Dossie no campo Consulta por com perfil restrito
   E seleciono a opcao Contem no campo Tipo de Operacao com perfil restrito
   E Digito os dados no campo Conteudo com perfil restrito
   E Clico no botao Consultar com perfil restrito
   Entao visualizo o resultado na grid com perfil restrito
    
Cenario: Verificar tela de Alteracao Dossie com alguns campos editaveis
	 Quando clico no botao Alterar Dossie de qualquer dossie com perfil restrito
	 E visualizo a tela de Alteracao Dossie com todos os campos editaveis com perfil restrito
	 E visualiso os botoes Mensagem e Solicita Subsidios desabilitados
	 Entao nao tenho permissao para enviar mensagem e solicitar subsidios
	