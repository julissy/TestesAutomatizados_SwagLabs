  #language: pt
  #enconding: UTF-8

  Funcionalidade: Login
    @login
  Esquema do Cenario: Usuario inválido
    Quando informo username "<name>"
    E informo password "<password>"
    E clico no botao de login
    Entao o sistema exibe a mensagem usuario invalido
    Exemplos:
      | name | password |
      | ad     | secret_sauce |
      | standard_user | ads   |
      |  ad             | ads    |

  Cenario: Realizar Login
    Quando informo username "standard_user"
    E informo password "secret_sauce"
    E clico no botao de login
    Entao o sistema exibe usuario logado


  Esquema do Cenario: Campos obrigatorios
    Quando informo username "<name>"
    E informo password "<password>"
    E clico no botao de login
    Entao o sistema exibe a mensagem de campo obrigatorio
    Exemplos:
      | name | password |
      |      | secret_sauce |
      | standard_user |     |
      |               |     |

  Cenario: Realizar Logout
    Quando informo username "standard_user"
    E informo password "secret_sauce"
    E clico no botao de login
    E o sistema exibe usuario logado
    E clico no menu
    E clico em logout
    Entao retorno para a pagina inicial
