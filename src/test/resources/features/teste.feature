  #language: pt
  #enconding: UTF-8

  Funcionalidade: Acessar o sistema
  Contexto:
    Dado que eu estou acessando o sistema
    Quando informo username
    E informo password
    Entao o sistema mostra a pagina inicial

  Cenario: cenario 01
    Quando eu cadastro um usuario

  Cenario: cenario 02
    Quando eu editar um usuario
