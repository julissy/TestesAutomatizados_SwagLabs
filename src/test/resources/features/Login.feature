  #language: pt
  #enconding: UTF-8

  Funcionalidade: Login

    Esquema do Cenario: Usuario inválido
      Quando informo username "<name>"
      E informo password "<password>"
      E clico no botao de login
      Entao o sistema exibe a mensagem usuario invalido
      Exemplos:
        | name          | password     |
        | ad            | secret_sauce |
        | standard_user | ads          |
        | ad            | ads          |

    Cenario: Realizar Login
      Quando realizo login "standard_user","secret_sauce"
      Entao o sistema exibe usuario logado

    @login
    Esquema do Cenario: Campos obrigatorios
      Quando informo username "<name>"
      E informo password "<password>"
      E clico no botao de login
      Entao o sistema exibe a mensagem de campo obrigatorio
      Exemplos:
        | name          | password     |
        |               | secret_sauce |
        | standard_user |              |
        |               |              |


    Cenario: Realizar Logout
      Quando realizo login "standard_user","secret_sauce"
      E o sistema exibe usuario logado
      E clico no menu
      E clico em logout
      Entao retorno para a pagina inicial

