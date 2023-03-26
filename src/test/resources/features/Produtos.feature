 #language: pt
  # enconding: UTF-8
 @homepage
 Funcionalidade: Produtos
   Contexto:
     Quando realizo login "standard_user","secret_sauce"
     E o sistema exibe usuario logado

   Cenario: Visualizar 6 produtos na pagina inicial
     Quando vejo a tela principal
     Entao visualizo todos produtos
