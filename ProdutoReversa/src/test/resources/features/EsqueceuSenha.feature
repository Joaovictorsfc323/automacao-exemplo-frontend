# language:pt
# enconding: UTF- 8

Funcionalidade: produto devolucao Reversa 


@EsquecerSenha01 @regressivoEsqueceuSenha
Esquema do Cenario: VERIFICAR TELA esquecer SENHA 
 
Dado que exibe tela de login 
Quando clico no link esqueceu sua senha da tela login 
E exibe tela esqueceu sua senha
E digito no campo endereco de e-mail tela esqueceu sua senha"<enderecodeemail>"
E clico no botao OK tela esqueceu sua senha
Entao sistema envia notificacao por email para fazer reset de senha


Exemplos: 
|enderecodeemail            |
|joaovictor.sfc323@gmail.com|


@EsquecerSenha02 @regressivoEsqueceuSenha
Esquema do Cenario: VERIFICAR email NaO INFORMADO NO CAMPO

Dado que exibe tela de login 
Quando clico no link esqueceu sua senha da tela login 
E exibe tela esqueceu sua senha
E nao digito no campo endereco de e-mail tela esqueceu sua senha"<enderecodeemail>"
E clico no botao OK tela esqueceu sua senha
Entao sistema retorna mensagem por favor informe o nome de usuario 

Exemplos: 
|enderecodeemail |
|                |