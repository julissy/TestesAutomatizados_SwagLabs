  #language: pt
  #enconding: UTF-8

  Funcionalidade: Login

  Cenario: Usuario inválido
    Quando informo username "ad"
    E informo password "asd"
    E clico no botao de login
    Entao o sistema exibe a mensagem usuario invalido

  Cenario: Realizar Login
    Quando informo username "standard_user"
    E informo password "secret_sauce"
    E clico no botao de login
    Entao o sistema exibe usuario logado
