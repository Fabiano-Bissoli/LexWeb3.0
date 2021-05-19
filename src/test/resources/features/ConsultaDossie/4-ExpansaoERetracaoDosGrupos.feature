#language: pt

@funcionais
Funcionalidade: Funcionario ou terceiro com a acesso ao modulo Dossie
  Como funcionario Bradesco Seguro ou terceiro, ativo no sistema
  Gostaria de expandir e retrair os grupos da tela Alterar Dossie
  Para que eu possa visualizar os campos de cada grupo
  
 Contexto: Logar no sistema LEXWeb 3.0
   Dado que estou acessando o sistema LEXWeb
   Quando seleciono a opcao Numero Dossie no campo Consulta por
   E seleciono a opcao Contem no campo Tipo de Operacao
   E Digito os dados no campo Conteudo
   E Clico no botao Consultar 
   E visualizo o resultado na grid
   Quando clico no botao Alterar Dossie de qualquer dossie
	 Entao visualizo a tela de Alteracao Dossie com todos os grupos retraidos
    
Cenario: Verificar expansao e retracao do grupo Campos Principais
	 Quando clico no grupo Campos Principais para expandir
	 E o grupo Campos Principais se expande exibindo os campos
	 E clico no grupo Campos Principais para retrair
	 Entao o grupo Campos Principais se retrai ocultando os campos
	 
Cenario: Verificar expansao e retracao do grupo Partes
	 Quando clico no grupo Partes para expandir
	 E o grupo Partes se expande exibindo os campos
	 E clico no grupo Partes para retrair
	 Entao o grupo Partes se retrai ocultando os campos
	 
Cenario: Verificar expansao e retracao do grupo Advogados
	 Quando clico no grupo Advogados para expandir
	 E o grupo Advogados se expande exibindo os campos
	 E clico no grupo Advogados para retrair
	 Entao o grupo Advogados se retrai ocultando os campos
	 
Cenario: Verificar expansao e retracao do grupo Complemento
	 Quando clico no grupo Complemento para expandir
	 E o grupo Complemento se expande exibindo os campos
	 E clico no grupo Complemento para retrair
	 Entao o grupo Complemento se retrai ocultando os campos
	
Cenario: Verificar expansao e retracao do grupo Campos Adicionais
	 Quando clico no grupo Campos Adicionais para expandir
	 E o grupo Campos Adicionais se expande exibindo os campos
	 E clico no grupo Campos Adicionais para retrair
	 Entao o grupo Campos Adicionais se retrai ocultando os campos