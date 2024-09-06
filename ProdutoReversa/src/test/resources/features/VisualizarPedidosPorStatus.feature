	# language:pt
# enconding: UTF- 8

Funcionalidade: produto devolucao Reversa 


@visualizarStatus01 @PedidosPorStatus
Esquema do Cenario: VERIFICAR aba de todos STATUS PEDIDOS DEVOLUCOES DOS CLIENTE
 
Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login 
E exibe tela inicio 
E clico no menu pedidos devolucoes
E exibe tela pedidos devolucoes
E clico na aba todos
Entao sistema retorna com lista de todos status disponiveis 

Exemplos: 
|enderecodeemail            |senha    |
|joaovictor.sfc323@gmail.com|Nova@1010| 


@visualizarStatus02 @PedidosPorStatus
Esquema do Cenario: VERIFICAR ABA DE STATUS PENDENTE PEDIDOS DEVOLUCOES DOS CLIENTE 


Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login 
E exibe tela inicio 
E clico no menu pedidos devolucoes
E exibe tela pedidos devolucoes
E clico na aba do status PENDENTE
Entao sistema retorna com lista de todos status pendente disponiveis


Exemplos: 
|enderecodeemail            |senha    |
|joaovictor.sfc323@gmail.com|Nova@1010| 


@visualizarStatus03 @PedidosPorStatus
Esquema do Cenario: VERIFICAR CONSULTA DE STATUS APROVADO PEDIDOS DEVOLUCOES DOS CLIENTE 

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login 
E exibe tela inicio 
E clico no menu pedidos devolucoes
E exibe tela pedidos devolucoes
E clico na aba do status APROVADO
Entao sistema retorna com lista de todos status aprovado disponiveis 


Exemplos: 
|enderecodeemail            |senha    |
|joaovictor.sfc323@gmail.com|Nova@1010| 


@visualizarStatus04 @PedidosPorStatus
Esquema do Cenario: VERIFICAR CONSULTA DE STATUS enviado PEDIDOS DEVOLUCOES DOS CLIENTE 

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login 
E exibe tela inicio 
E clico no menu pedidos devolucoes
E exibe tela pedidos devolucoes
E clico na aba do status ENVIADO
Entao sistema retorna com lista de todos status ENVIADO disponiveis 


Exemplos: 
|enderecodeemail            |senha    |
|joaovictor.sfc323@gmail.com|Nova@1010| 


@visualizarStatus05 @PedidosPorStatus
Esquema do Cenario: VERIFICAR CONSULTA DE STATUS RECEBIDO PEDIDOS DEVOLUCOES DOS CLIENTE 

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login 
E exibe tela inicio 
E clico no menu pedidos devolucoes
E exibe tela pedidos devolucoes
E clico na aba do status RECEBIDO
Entao sistema retorna com lista de todos status RECEBIDO disponiveis 


Exemplos: 
|enderecodeemail            |senha    |
|joaovictor.sfc323@gmail.com|Nova@1010| 



@visualizarStatus06 @PedidosPorStatus
Esquema do Cenario: VERIFICAR CONSULTA DE STATUS RESOLVIDO PEDIDOS DEVOLUCOES DOS CLIENTE 

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login 
E exibe tela inicio 
E clico no menu pedidos devolucoes
E exibe tela pedidos devolucoes
E clico na aba do status RESOLVIDO
Entao sistema retorna com lista de todos status RESOLVIDO disponiveis 


Exemplos: 
|enderecodeemail            |senha    |
|joaovictor.sfc323@gmail.com|Nova@1010| 


@visualizarStatus07 @PedidosPorStatus
Esquema do Cenario: VERIFICAR CONSULTA DE STATUS REJEITADO PEDIDOS DEVOLUCOES DOS CLIENTE 

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login 
E exibe tela inicio 
E clico no menu pedidos devolucoes
E exibe tela pedidos devolucoes
E clico na aba do status REJEITADO
Entao sistema retorna com lista de todos status REJEITADO disponiveis 


Exemplos: 
|enderecodeemail            |senha    |
|joaovictor.sfc323@gmail.com|Nova@1010|  