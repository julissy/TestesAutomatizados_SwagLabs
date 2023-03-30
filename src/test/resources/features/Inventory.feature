 #language: pt
  # enconding: UTF-8
 @homepage
 Funcionalidade: Produtos

   Contexto:
     Quando realizo login "standard_user","secret_sauce"
     E o sistema exibe usuario logado

   @produtos
   Cenario: Visualizar todos produtos
     Quando vejo a tela principal
     Entao visualizo todos produtos

   @produtos1
   Cenario: Ordenação da lista de produtos por nome AZ
     Quando vejo a tela principal
     Entao os produtos estao ordenados de AZ

   Cenario: Ordenação da lista de produtos por nome ZA
     Quando vejo a tela principal
     E clico no funil
     E clico na opcao name ZA
     Entao os produtos ficam ordenados de ZA

   @produtos2
   Cenario: Ordenacao da lista de produtos por preco low-high
     Quando vejo a tela principal
     E clico no funil
     E clico na opcao price low-high
     Entao os produtos ficam ordenados preco menor para maior
@produtos3
   Cenario: Ordenacao da lista de produtos por preco high-low
     Quando vejo a tela principal
     E clico no funil
     E clico na opcao price high-low
     Entao os produtos ficam ordenados preco maior para menor