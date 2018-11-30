#language: pt
@funcionais
Funcionalidade: Cadastro de contas
  
  Como um usuário 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  #Background em Ingles
  Contexto:
   
   # ---- Cenário declarativo - Mais utilizado na comunidade, relfete o comportamento e não como  ----------
   Dado que desejo adicionar uma conta

	Esquema do Cenário: Deve validar regras cadastro contas
  
    # ---- Cenário declarativo - Mais utilizado na comunidade, relfete o comportamento e não como  ----------
    Quando adiciona a "<conta>"
    Então recebo a mensagem "<mensagem>"
   
   Exemplos:
   | conta 						| mensagem 										  		|
   | Conta de Teste		| Conta adicionada com sucesso! 		|
   |									| Informe o nome da conta						|
   | Conta mesmo nome	| Já existe uma conta com esse nome!|
