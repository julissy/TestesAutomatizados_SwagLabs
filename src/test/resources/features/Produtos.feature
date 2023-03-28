 #language: pt
  # enconding: UTF-8
 @homepage
 Funcionalidade: Produtos
   Contexto:
     Quando realizo login "standard_user","secret_sauce"
     E o sistema exibe usuario logado

   Cenario: Visualizar todos produtos
     Quando vejo a tela principal
     Entao visualizo todos produtos
@produtos
   Cenario: Ordenação da lista de produtos por nome
     Quando vejo a tela principal
     E clico no funil
     E clico na opcao name ZA
     Entao os produtos ficam ordenados de ZA