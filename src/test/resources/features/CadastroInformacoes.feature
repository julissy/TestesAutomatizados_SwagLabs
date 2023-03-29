#language: pt
  # enconding: UTF-8

Funcionalidade: Cadastro informações

  Contexto:
    Quando realizo login "standard_user","secret_sauce"
    E o sistema exibe usuario logado
    E clico no botao carrinho
    E clico no botao checkout


  Cenario: Realizar cadastro de informacoes
    Quando informo first name "Teste"
    E informo last name "Testando"
    E informo zip code 60000000
    E clico no botao continue
    Entao o sistema exibe a tela overview

  @informacoes
  Esquema do Cenario: Campos obrigatorios
    Quando informo first name "<firstname>"
    E informo last name "<lastname>"
    E informo zip code "<zipcode>"
    E clico no botao continue
    Entao o sistema exibe a mensagem de campo obrigatorio da tela
    Exemplos:
      | firstname | lastname | zipcode  |
      |           | testando | 60000000 |
      | teste     |          | 60000000 |
      | teste     | testando |          |
      |           |          |          |
