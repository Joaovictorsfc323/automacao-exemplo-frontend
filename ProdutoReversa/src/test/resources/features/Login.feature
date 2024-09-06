# language:pt
# enconding: UTF- 8

Funcionalidade: produto devolucao Reversa 


@login01 @regressivoLogin
Esquema do Cenario: Verificar Login USUARIO

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login 
Entao e feito login com sucesso 

Exemplos: 
|enderecodeemail            |senha    |
|joaovictor.sfc323@gmail.com|Nova@1010|



@login02 @regressivoLogin
Esquema do Cenario: VERIFICAR endereco DE email NaO INFORMADO NO CAMPO

Dado que exibe tela de login
Quando nao digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login
Entao o sistema retorna nome de usuario ou senha invalida


Exemplos: 
|enderecodeemail|senha    |
|               |Nova@1010|


@login03 @regressivoLogin
Esquema do Cenario: VERIFICAR email INCORRETO 

Dado que exibe tela de login
Quando digito no campo endereco de e-mail incorreto tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login
Entao o sistema retorna nome de usuario ou senha invalida

Exemplos: 
|enderecodeemail|senha    |
|emailincorreto@|Nova@1010|


@login04 @regressivoLogin
Esquema do Cenario: VERIFICAR SENHA NaO INFORMADO NO CAMPO 

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E nao digito no campo senha tela login"<senha>"
E clico no botao entrar tela login
Entao o sistema retorna nome de usuario ou senha invalida

Exemplos: 
|enderecodeemail            |senha|
|joaovictor.sfc323@gmail.com|     | 


@login05 @regressivoLogin
Esquema do Cenario: VERFICAR SENHA INCORRETO 
 
Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha incorreto tela login"<senha>"
E clico no botao entrar tela login
Entao o sistema retorna nome de usuario ou senha invalida

Exemplos: 
|enderecodeemail            |senha      |
|joaovictor.sfc323@gmail.com|SenhaErrada|