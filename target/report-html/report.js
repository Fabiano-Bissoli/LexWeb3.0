$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ConsultaDossie/1-LogarNoSistemaComAcessoAoMuduloDossie.feature");
formatter.feature({
  "name": "Funcionario ou terceiro com a acesso ao modulo Dossie",
  "description": "  Como funcionario Bradesco Seguro ou terceiro, ativo no sistema\n  Gostaria de Alterar ou Visualizar o grupo Campos Adicionais da tela de Dossie\n  Para que eu possa Alterar dados dos processos judiciais",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.background({
  "name": "Logar no sistema LEXWeb 3.0",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou acessando o sistema LEXWeb",
  "keyword": "Dado "
});
formatter.match({
  "location": "UserLiberadoBDD.queAcessoSistemaLEXWeb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a opcao Numero Dossie no campo Consulta por",
  "keyword": "Quando "
});
formatter.match({
  "location": "UserLiberadoBDD.clicarNoConsultaPor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a opcao Contem no campo Tipo de Operacao",
  "keyword": "E "
});
formatter.match({
  "location": "UserLiberadoBDD.clicarNoTipoDeOperacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Digito os dados no campo Conteudo",
  "keyword": "E "
});
formatter.match({
  "location": "UserLiberadoBDD.clicarNoConteudo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clico no botao Consultar",
  "keyword": "E "
});
formatter.match({
  "location": "UserLiberadoBDD.clicarBtnConsultar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo o resultado na grid",
  "keyword": "Entao "
});
formatter.match({
  "location": "UserLiberadoBDD.visualisoConsulta()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verificar tela de Alteracao Dossie com os campos editaveis",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "name": "clico no botao Alterar Dossie de qualquer dossie",
  "keyword": "Quando "
});
formatter.match({
  "location": "UserLiberadoBDD.clicarBtnAlterarDossie()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a tela de Alteracao Dossie com todos os campos editaveis",
  "keyword": "Entao "
});
formatter.match({
  "location": "UserLiberadoBDD.visualisoTelaAlterarDossie()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/ConsultaDossie/2-LogarSemDireitoEnviarMensagemESolicitarSubsidios.feature");
formatter.feature({
  "name": "Funcionario ou terceiro restrito enviar mensagem e solicitar subsidio",
  "description": "  Como funcionario Bradesco Seguro ou terceiro, ativo no sistema e com restricoes\n  Gostaria de logar no sistema LEXWeb3.0\n  Para que eu nao possa enviar mensagem e nem solicitar subsidio",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.background({
  "name": "Logar no sistema LEXWeb 3.0",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou acessando o sistema LEXWeb com perfil restrito",
  "keyword": "Dado "
});
formatter.match({
  "location": "UsuarioSemPermissaoEnviarMensagemBDD.queAcessoSistemaLEXWeb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a opcao Numero Dossie no campo Consulta por com perfil restrito",
  "keyword": "Quando "
});
formatter.match({
  "location": "UsuarioSemPermissaoEnviarMensagemBDD.clicarNoConsultaPor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a opcao Contem no campo Tipo de Operacao com perfil restrito",
  "keyword": "E "
});
formatter.match({
  "location": "UsuarioSemPermissaoEnviarMensagemBDD.clicarNoTipoDeOperacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Digito os dados no campo Conteudo com perfil restrito",
  "keyword": "E "
});
formatter.match({
  "location": "UsuarioSemPermissaoEnviarMensagemBDD.clicarNoConteudo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clico no botao Consultar com perfil restrito",
  "keyword": "E "
});
formatter.match({
  "location": "UsuarioSemPermissaoEnviarMensagemBDD.clicarBtnConsultar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo o resultado na grid com perfil restrito",
  "keyword": "Entao "
});
formatter.match({
  "location": "UsuarioSemPermissaoEnviarMensagemBDD.visualisoConsulta()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verificar tela de Alteracao Dossie com alguns campos editaveis",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "name": "clico no botao Alterar Dossie de qualquer dossie com perfil restrito",
  "keyword": "Quando "
});
formatter.match({
  "location": "UsuarioSemPermissaoEnviarMensagemBDD.clicarBtnAlterarDossie()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a tela de Alteracao Dossie com todos os campos editaveis com perfil restrito",
  "keyword": "E "
});
formatter.match({
  "location": "UsuarioSemPermissaoEnviarMensagemBDD.visualisoTelaAlterarDossie()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualiso os botoes Mensagem e Solicita Subsidios desabilitados",
  "keyword": "E "
});
formatter.match({
  "location": "UsuarioSemPermissaoEnviarMensagemBDD.visualisoBtnsMensagemESolSub()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027LBR-PE0772BQ\u0027, ip: \u002710.130.25.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.93, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\fbissoli\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:51439}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: fd80ea7317e2c8dbbab26eeb95c2f941\n*** Element info: {Using\u003dxpath, value\u003d/html/body/app-root/clr-main-container/app-alteracao-dossie/div/div[1]/div/div/div[2]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat br.com.braseg.config.consultas.ChromeUsuarioLiberado.alteracaoDossie(ChromeUsuarioLiberado.java:72)\r\n\tat br.com.braseg.consultas.steps.UsuarioSemPermissaoEnviarMensagemBDD.visualisoBtnsMensagemESolSub(UsuarioSemPermissaoEnviarMensagemBDD.java:60)\r\n\tat ✽.visualiso os botoes Mensagem e Solicita Subsidios desabilitados(file:src/test/resources/features/ConsultaDossie/2-LogarSemDireitoEnviarMensagemESolicitarSubsidios.feature:20)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "nao tenho permissao para enviar mensagem e solicitar subsidios",
  "keyword": "Entao "
});
formatter.match({
  "location": "UsuarioSemPermissaoEnviarMensagemBDD.semPermissaoEnviarESolicitar()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/features/ConsultaDossie/3-UsuarioSemPermissaoTelaDeAlteracao.feature");
formatter.feature({
  "name": "Funcionario ou terceiro restrito a acessar a tela de alteracao",
  "description": "  Como funcionario Bradesco Seguro ou terceiro, ativo no sistema e com restricoes\n  Gostaria de logar no sistema LEXWeb3.0\n  Para que eu nao possa ter acesso a tela de alteracao",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.background({
  "name": "Logar no sistema LEXWeb 3.0",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou acessando o sistema LEXWeb com perfil restrito a tela de alteracao",
  "keyword": "Dado "
});
formatter.match({
  "location": "UsuarioSemPermissaoTelaAlteracaoBDD.queAcessoSistemaLEXWeb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a opcao Numero Dossie no campo Consulta por com restricao a tela de alteracao",
  "keyword": "Quando "
});
formatter.match({
  "location": "UsuarioSemPermissaoTelaAlteracaoBDD.clicarNoConsultaPor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a opcao Contem no campo Tipo de Operacao com restricao a tela de alteracao",
  "keyword": "E "
});
formatter.match({
  "location": "UsuarioSemPermissaoTelaAlteracaoBDD.clicarNoTipoDeOperacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Digito os dados no campo Conteudo com restricao a tela de alteracao",
  "keyword": "E "
});
formatter.match({
  "location": "UsuarioSemPermissaoTelaAlteracaoBDD.clicarNoConteudo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clico no botao Consultar com restricao a tela de alteracao",
  "keyword": "E "
});
formatter.match({
  "location": "UsuarioSemPermissaoTelaAlteracaoBDD.clicarBtnConsultar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo o resultado na grid com o botao Alterar desabilitado",
  "keyword": "Entao "
});
formatter.match({
  "location": "UsuarioSemPermissaoTelaAlteracaoBDD.visualisoConsulta()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verificar se o botao Alterar esta desabilitado",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "name": "clico no botao Alterar Dossie desabilitado de qualquer dossie",
  "keyword": "Quando "
});
formatter.match({
  "location": "UsuarioSemPermissaoTelaAlteracaoBDD.clicarBtnAlterarDossie()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "n�o tenho permissao para alterar nenhum dossie",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});