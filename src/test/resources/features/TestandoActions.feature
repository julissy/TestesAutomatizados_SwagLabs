  #language: pt
  #enconding: UTF-8
 @dropdown
  Funcionalidade: Testar Actions
    Contexto:
      Quando realizo login "standard_user","secret_sauce"
      E o sistema exibe usuario logado

    Cenario: verificar mudanca de cor do nome do produto
      Quando eu mover o mouse para nome do produto
      E clico no nome do produto
      Entao o sistema exibe a pagina do produto

