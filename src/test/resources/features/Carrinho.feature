 #language: pt
  # enconding: UTF-8

 Funcionalidade: Carrinho

   Contexto:
     Quando realizo login "standard_user","secret_sauce"
     E o sistema exibe usuario logado

   Cenario: Adicionar produto no carrinho
     Quando clico no botao Add to cart de todos os produtos
     Entao o botao cart apresenta seis itens
   @carrinho
   Cenario: Deletar produto no carrinho
     Quando clico no botao Add to cart de todos os produtos
     E clico no botao Delete de todos os produtos
     Entao o botao cart nao apresenta itens