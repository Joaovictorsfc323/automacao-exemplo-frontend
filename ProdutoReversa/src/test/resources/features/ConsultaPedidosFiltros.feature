	# language:pt
# enconding: UTF- 8

Funcionalidade: produto devolucao Reversa 


@filtrosPedidos01 @PedidosDevolucoes
Esquema do Cenario: VERIFICAR  FILTRO DE STATUS PENDENTE PEDIDOS DEVOLUCOES DOS CLIENTE 

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login 
E exibe tela inicio 
E clico no menu pedidos devolucoes
E exibe tela pedidos devolucoes
E clico no filtro DATA
E escolher data especifica do lojista conforme desejado "<data>"
E clico em buscar filtros 
Entao sistema retorna com lista das combinacao que lojista selecionou disponiveis 

Exemplos: 
|enderecodeemail            |senha    |data      |
|joaovictor.sfc323@gmail.com|Nova@1010|11/05/2022|



