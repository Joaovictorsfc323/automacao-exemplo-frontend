	# language:pt
# enconding: UTF- 8

Funcionalidade: produto devolucao Reversa 

@CriarUsuario01 @regressivoCriarUsuario
Esquema do Cenario: Validar cadastrado com sucesso do usuario 

Dado que exibe tela de login
Quando clico no link cadastre-se da tela de login 
E exibe tela de registre -se 
E digito no campo primeiro nome tela de registre -se"<primeironome>"
E digito no campo sobrenome tela de registre -se"<sobrenome>"
E digito no campo endereco de e-mail tela de registre -se"<enderecodeemail>"
E digito no campo senha tela de registre -se"<senha>"
E digito no campo confirme a senha tela de registre -se"<confirmesenha>"
E clico no botao cadastre-se 
Entao exibe tela verificacao de endereco de email

Exemplos: 

|primeironome|sobrenome|enderecodeemail                 |senha    |confirmesenha|
|joao        |Francisco|joao.santana@cliqueretire.com.br|Nova@1010|Nova@1010    |



@CriarUsuario02 @regressivoCriarUsuario
Esquema do Cenario: VERIFICAR PRIMEIRO NOME NaO INFORMADO NO CAMPO

Dado que exibe tela de login
Quando clico no link cadastre-se da tela de login 
E exibe tela de registre -se 
E nao digito no campo primeiro nome tela de registre -se"<primeironome>"
E digito no campo sobrenome tela de registre -se"<sobrenome>"
E digito no campo endereco de e-mail tela de registre -se"<enderecodeemail>"
E digito no campo senha tela de registre -se"<senha>"
E digito no campo confirme a senha tela de registre -se"<confirmesenha>"
E clico no botao cadastre-se 
Entao sistema retorna mensagem  por favor informe o primeiro nome

Exemplos: 

|primeironome|sobrenome|enderecodeemail                 |senha    |confirmesenha|
|            |Francisco|joao.santana@cliqueretire.com.br|Nova@1010|Nova@1010    |



@CriarUsuario03 @regressivoCriarUsuario
Esquema do Cenario: Verificar SOBRENOME NaO INFORMADO NO CAMPO  

Dado que exibe tela de login
Quando clico no link cadastre-se da tela de login 
E exibe tela de registre -se 
E digito no campo primeiro nome tela de registre -se"<primeironome>"
E nao digito no campo sobrenome tela de registre -se"<sobrenome>"
E digito no campo endereco de e-mail tela de registre -se"<enderecodeemail>"
E digito no campo senha tela de registre -se"<senha>"
E digito no campo confirme a senha tela de registre -se"<confirmesenha>"
E clico no botao cadastre-se 
Entao sistema retorna mensagem  por favor informe o sobrenome
 
Exemplos: 

|primeironome|sobrenome|enderecodeemail                 |senha    |confirmesenha|
|victor      |         |joao.santana@cliqueretire.com.br|Nova@1010|Nova@1010    |


@CriarUsuario04 @regressivoCriarUsuario
Esquema do Cenario: VERIFICAR endereco DE email NaO INFORMADO NO CAMPO 

Dado que exibe tela de login
Quando clico no link cadastre-se da tela de login 
E exibe tela de registre -se 
E digito no campo primeiro nome tela de registre -se"<primeironome>"
E digito no campo sobrenome tela de registre -se"<sobrenome>"
E nao digito no campo endereco de e-mail tela de registre -se"<enderecodeemail>"
E digito no campo senha tela de registre -se"<senha>"
E digito no campo confirme a senha tela de registre -se"<confirmesenha>"
E clico no botao cadastre-se 
Entao sistema retorna mensagem  por favor informe o endereco de e-mail

Exemplos: 

|primeironome|sobrenome|enderecodeemail|senha    |confirmesenha|
|victor      |francisco|               |Nova@1010|Nova@1010    |

@CriarUsuario05 @regressivoCriarUsuario
Esquema do Cenario: VERIFICAR CAMPO SENHA NaO INFORMADO 

Dado que exibe tela de login
Quando clico no link cadastre-se da tela de login 
E exibe tela de registre -se 
E digito no campo primeiro nome tela de registre -se"<primeironome>"
E digito no campo sobrenome tela de registre -se"<sobrenome>"
E digito no campo endereco de e-mail tela de registre -se"<enderecodeemail>"
E nao digito no campo senha tela de registre -se"<senha>"
E digito no campo confirme a senha tela de registre -se"<confirmesenha>"
E clico no botao cadastre-se 
Entao sistema retorna mensagem  por favor informe a senha

Exemplos: 

|primeironome|sobrenome|enderecodeemail                 |senha |confirmesenha|
|victor      |Francisco|joao.santana@cliqueretire.com.br|      |Nova@1010    |

@CriarUsuario06 @regressivoCriarUsuario
Esquema do Cenario: VERIFICAR CAMPO CONFIRME A SENHA NaO INFORMADO 

Dado que exibe tela de login
Quando clico no link cadastre-se da tela de login 
E exibe tela de registre -se 
E digito no campo primeiro nome tela de registre -se"<primeironome>"
E digito no campo sobrenome tela de registre -se"<sobrenome>"
E digito no campo endereco de e-mail tela de registre -se"<enderecodeemail>"
E digito no campo senha tela de registre -se"<senha>"
E nao digito no campo confirme a senha tela de registre -se"<confirmesenha>"
E clico no botao cadastre-se 
Entao sistema retorna mensagem senha de confirmacao nao coincide

Exemplos: 
|primeironome|sobrenome|enderecodeemail                 |senha    |confirmesenha|
|victor      |Francisco|joao.santana@cliqueretire.com.br|Nova@1010|             |


@CriarUsuario07 @regressivoCriarUsuario
Esquema do Cenario: Lojista ja cadastrado

Dado que exibe tela de login
Quando clico no link cadastre-se da tela de login 
E exibe tela de registre -se 
E digito no campo primeiro nome tela de registre -se"<primeironome>"
E digito no campo sobrenome tela de registre -se"<sobrenome>"
E digito no campo endereco de e-mail tela de registre -se"<enderecodeemail>"
E digito no campo senha tela de registre -se"<senha>"
E digito no campo confirme a senha tela de registre -se"<confirmesenha>"
E clico no botao cadastre-se 
Entao sistema retorna informando endereco de e-mail ja existe

Exemplos: 

|primeironome|sobrenome|enderecodeemail                 |senha    |confirmesenha|
|joao        |Francisco|joao.santana@cliqueretire.com.br|Nova@1010|Nova@1010    |
