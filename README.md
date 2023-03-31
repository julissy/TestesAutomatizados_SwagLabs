# Projeto de Automação Web - Java, Selenium e Cucumber

Criação de casos de teste para testes de aceite do sistema [Swag Labs](https://www.saucedemo.com/)

## Instalação

Java 19
 
Maven 3.6

chrome Webdriver

Por conveniência, faça o download do chromedriver adequado para o seu sistema operacional e adicione o caminho no diretório utils/Util. Local para download: https://chromedriver.chromium.org/downloads

![WhatsApp Image 2023-03-28 at 15 53 37](https://user-images.githubusercontent.com/102709022/228339581-41f6bcea-1135-4ce3-8dfb-efae83bf6482.jpeg)




As dependências utilizadas já estão no pom.xml é preciso 
apenas utilizar o comando do Maven -Refresh Project- para 
que as dependências sejam baixadas no seu projeto


![image](https://user-images.githubusercontent.com/102709022/228332037-e0f80f54-65a3-4833-82fe-b2f0a69325c6.png)


## Como usar


Execução de Teste no diretório runners/RunnerTest.java 

Para execução de cenarios especificos modifique a tags apontando 
a tag utilizada nas features do diretório resources/features
```java
@CucumberOptions(
        plugin = {"pretty", "html: target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "stepsDefinitions",
        tags = "@login",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)
```
Para execução normal de todos os cenários utilizar comentando o plugin tags
```java
@CucumberOptions(
        plugin = {"pretty", "html: target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "stepsDefinitions",
       //tags = "@login",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)
```
Para geração de relatório mantenha no plugin o "html: target/cucumber-report.html"

Para execução dos testes clicar com botão esquerdo na seta verde que aparece ao lado 
da classe RunnerTest

![image](https://user-images.githubusercontent.com/102709022/228332191-6a204987-4cea-4478-8b8d-9569639c31d2.png)


