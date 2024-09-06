# language:pt
# enconding: UTF- 8

Funcionalidade: produto devolucao Reversa 


@minhaconta01 @regressivoMinhaConta
Esquema do Cenario: Verificar preenchimento dados da empresa e salvar 

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login
E exibe tela inicio
E clico na aba direita da tela inicio 
E clico menu sua conta da aba 
E exibe tela minha conta 
E digito no campo cnpj da tela minha conta"<cnpj>"
E digito no campo nome da organizacao da tela minha conta "<nomedaorganizacao>"
E digito no campo web site da tela minha conta "<website>"
E digito no campo pedidos mensais da tela minha conta "<pedidosmensais>"
E clico filtro timezone da tela minha conta 
E selecione umas das opcoes do filtro timezone
E digito no campo email da tela minha conta "<emailminhaconta>"
E digito no campo telefone da tela minha conta "<telefoneminhaconta>"
E digito no campo rua da tela minha conta "<rua>"
E digito no campo cidade da tela minha conta "<cidade>"
E digito no campo estado da tela minha conta "<estado>"
E digito no campo cep da tela minha conta "<cep>"
E clico botao salvar Alteracoes da tela minha conta 
Entao sistema devera salvar alteracoes feita  
 

Exemplos: 
|enderecodeemail                 |senha    |cnpj          |nomedaorganizacao|website                          |pedidosmensais|emailminhaconta                 |telefoneminhaconta|rua  |cidade|estado|Cep     |
|joao.santana@cliqueretire.com.br|Nova@1010|12344444444444|teste            |https://www.cliqueretire.com.br/ |8             |joao.santana@cliqueretire.com.br|11999999999       |teste|teste |teste |64030220|


@minhaconta02 @regressivoMinhaConta
Esquema do Cenario: Verificar nao preencher campo cnpj

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login
E exibe tela inicio
E clico na aba direita da tela inicio 
E clico menu sua conta da aba 
E exibe tela minha conta 
E nao digito no campo cnpj da tela minha conta"<cnpj>"
E digito no campo nome da organizacao da tela minha conta "<nomedaorganizacao>"
E digito no campo web site da tela minha conta "<website>"
E digito no campo pedidos mensais da tela minha conta "<pedidosmensais>"
E clico filtro timezone da tela minha conta 
E selecione umas das opcoes do filtro timezone
E digito no campo email da tela minha conta "<emailminhaconta>"
E digito no campo telefone da tela minha conta "<telefoneminhaconta>"
E digito no campo rua da tela minha conta "<rua>"
E digito no campo cidade da tela minha conta "<cidade>"
E digito no campo estado da tela minha conta "<estado>"
E digito no campo cep da tela minha conta "<cep>"
E clico botao salvar Alteracoes da tela minha conta 
Entao sistema devera apresentar mensagem preencha todos os campos obrigatorios  
 

Exemplos: 
|enderecodeemail            |senha    |cnpj|nomedaorganizacao|website                          |pedidosmensais|emailminhaconta            |telefoneminhaconta|rua  |cidade|estado|Cep     |
|joaovictor.sfc323@gmail.com|Nova@1010|    |teste            |https://www.cliqueretire.com.br/ |8             |joaovictor.sfc323@gmail.com|11999999999       |teste|teste |teste |64030220|



@minhaconta03 @regressivoMinhaConta
Esquema do Cenario: Verificar nao preencher campo nome da organizacao

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login
E exibe tela inicio
E clico na aba direita da tela inicio 
E clico menu sua conta da aba 
E exibe tela minha conta 
E digito no campo cnpj da tela minha conta"<cnpj>"
E nao digito no campo nome da organizacao da tela minha conta "<nomedaorganizacao>"
E digito no campo web site da tela minha conta "<website>"
E digito no campo pedidos mensais da tela minha conta "<pedidosmensais>"
E clico filtro timezone da tela minha conta 
E selecione umas das opcoes do filtro timezone
E digito no campo email da tela minha conta "<emailminhaconta>"
E digito no campo telefone da tela minha conta "<telefoneminhaconta>"
E digito no campo rua da tela minha conta "<rua>"
E digito no campo cidade da tela minha conta "<cidade>"
E digito no campo estado da tela minha conta "<estado>"
E digito no campo cep da tela minha conta "<cep>"
E clico botao salvar Alteracoes da tela minha conta 
Entao sistema devera apresentar mensagem preencha todos os campos obrigatorios  
 

Exemplos: 
|enderecodeemail            |senha    |cnpj          |nomedaorganizacao|website                          |pedidosmensais|emailminhaconta            |telefoneminhaconta|rua  |cidade|estado|Cep     |
|joaovictor.sfc323@gmail.com|Nova@1010|12344444444444|                 |https://www.cliqueretire.com.br/ |8             |joaovictor.sfc323@gmail.com|11999999999       |teste|teste |teste |64030220|



@minhaconta04 @regressivoMinhaConta
Esquema do Cenario: Verificar nao preencher campo website

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login
E exibe tela inicio
E clico na aba direita da tela inicio 
E clico menu sua conta da aba 
E exibe tela minha conta 
E digito no campo cnpj da tela minha conta"<cnpj>"
E digito no campo nome da organizacao da tela minha conta "<nomedaorganizacao>"
E nao digito no campo web site da tela minha conta "<website>"
E digito no campo pedidos mensais da tela minha conta "<pedidosmensais>"
E clico filtro timezone da tela minha conta 
E selecione umas das opcoes do filtro timezone
E digito no campo email da tela minha conta "<emailminhaconta>"
E digito no campo telefone da tela minha conta "<telefoneminhaconta>"
E digito no campo rua da tela minha conta "<rua>"
E digito no campo cidade da tela minha conta "<cidade>"
E digito no campo estado da tela minha conta "<estado>"
E digito no campo cep da tela minha conta "<cep>"
E clico botao salvar Alteracoes da tela minha conta 
Entao sistema devera apresentar mensagem preencha todos os campos obrigatorios   
 

Exemplos: 
|enderecodeemail            |senha    |cnpj          |nomedaorganizacao|website|pedidosmensais|emailminhaconta            |telefoneminhaconta|rua  |cidade|estado|Cep     |
|joaovictor.sfc323@gmail.com|Nova@1010|12344444444444|teste            |       |8             |joaovictor.sfc323@gmail.com|11999999999       |teste|teste |teste |64030220|


@minhaconta05 @regressivoMinhaConta
Esquema do Cenario: Verificar nao preencher campo pedidosmensais

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login
E exibe tela inicio
E clico na aba direita da tela inicio 
E clico menu sua conta da aba 
E exibe tela minha conta 
E digito no campo cnpj da tela minha conta"<cnpj>"
E digito no campo nome da organizacao da tela minha conta "<nomedaorganizacao>"
E digito no campo web site da tela minha conta "<website>"
E nao digito no campo pedidos mensais da tela minha conta "<pedidosmensais>"
E clico filtro timezone da tela minha conta 
E selecione umas das opcoes do filtro timezone
E digito no campo email da tela minha conta "<emailminhaconta>"
E digito no campo telefone da tela minha conta "<telefoneminhaconta>"
E digito no campo rua da tela minha conta "<rua>"
E digito no campo cidade da tela minha conta "<cidade>"
E digito no campo estado da tela minha conta "<estado>"
E digito no campo cep da tela minha conta "<cep>"
E clico botao salvar Alteracoes da tela minha conta 
Entao sistema devera apresentar mensagem preencha todos os campos obrigatorios   
 

Exemplos: 
|enderecodeemail            |senha    |cnpj          |nomedaorganizacao|website                          |pedidosmensais|emailminhaconta            |telefoneminhaconta|rua  |cidade|estado|Cep     |
|joaovictor.sfc323@gmail.com|Nova@1010|12344444444444|teste            |https://www.cliqueretire.com.br/ |              |joaovictor.sfc323@gmail.com|11999999999       |teste|teste |teste |64030220|



@minhaconta06 @regressivoMinhaConta
Esquema do Cenario: Verificar nao preencher campo email minha conta

Dado que exibe tela de login
Quando digito no campo endereco de e-mail tela login"<enderecodeemail>"
E digito no campo senha tela login"<senha>"
E clico no botao entrar tela login
E exibe tela inicio
E clico na aba direita da tela inicio 
E clico menu sua conta da aba 
E exibe tela minha conta 
E digito no campo cnpj da tela minha conta"<cnpj>"
E digito no campo nome da organizacao da tela minha conta "<nomedaorganizacao>"
E digito no campo web site da tela minha conta "<website>"
E digito no campo pedidos mensais da tela minha conta "<pedidosmensais>"
E clico filtro timezone da tela minha conta 
E selecione umas das opcoes do filtro timezone
E nao digito no campo email da tela minha conta "<emailminhaconta>"
E digito no campo telefone da tela minha conta "<telefoneminhaconta>"
E digito no campo rua da tela minha conta "<rua>"
E digito no campo cidade da tela minha conta "<cidade>"
E digito no campo estado da tela minha conta "<estado>"
E digito no campo cep da tela minha conta "<cep>"
E clico botao salvar Alteracoes da tela minha conta 
Entao sistema devera apresentar mensagem preencha todos os campos obrigatorios   
 

Exemplos: 
|enderecodeemail            |senha    |cnpj          |nomedaorganizacao|website                          |pedidosmensais|emailminhaconta|telefoneminhaconta|rua  |cidade|estado|Cep     |
|joaovictor.sfc323@gmail.com|Nova@1010|12344444444444|teste            |https://www.cliqueretire.com.br/ |8             |               |11999999999       |teste|teste |teste |64030220|















