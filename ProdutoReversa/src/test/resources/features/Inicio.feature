	# language:pt
# enconding: UTF- 8

Funcionalidade: produto devolucao Reversa 


@Inicio01 @regressivoInicio
Esquema do Cenario: Verificar Login USUARIO

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login
E exibe tela inicio
E clico no botao logout da tela inicio 
Entao exibe tela login

Exemplos: 
|enderecodeemail            |senha    |
|joaovictor.sfc323@gmail.com|Nova@1010|



@abaSair @regressivoInicio
Esquema do Cenario: Verificar clicar sair na aba 

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login
E exibe tela inicio
E clico na aba direita da tela inicio
  E clico menu sair da aba
Entao exibe tela login

Exemplos: 
|enderecodeemail            |senha    |
|joaovictor.sfc323@gmail.com|Nova@1010|