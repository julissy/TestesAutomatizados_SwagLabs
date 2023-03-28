# Projeto de Automação Web - Java, Selenium e Cucumber

Criação de cenários para testes de aceitação do sistema [Swag Labs](https://www.saucedemo.com/)

## Installation

Java
 
Maven

Por conveniência, faça o download do chromedriver adequado para o seu sistema operacional e adicione no diretório utils/Util. Local para download: https://chromedriver.chromium.org/downloads


```bash
As dependências utilizadas já estão no pom.xml é preciso 
apenas utilizar o comando do Maven -Refresh Project- para 
que as dependências sejam baixadas no seu projeto
```

![image](https://user-images.githubusercontent.com/102709022/228332037-e0f80f54-65a3-4833-82fe-b2f0a69325c6.png)




## Usage

```python
Execução de Teste
# no diretório runners/RunnerTest.java 
Fazer as seguintes alterações no @CucumberOptions
@CucumberOptions(
        plugin = {"pretty", "html: target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "stepsDefinitions",
//Para execução de cenários específicos aponte a tag utilizada nas features do 
diretório resources/features
        tags = "@login",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
//Para execução da tela de teste mantenha false
        dryRun = false
)


# clicar com botão esquerdo na seta verde que aparece ao lado 
da classe RunnerTest

```

![image](https://user-images.githubusercontent.com/102709022/228332191-6a204987-4cea-4478-8b8d-9569639c31d2.png)


