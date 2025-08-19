# C14AULA
Exercicios de sala de aula

## Descrição

Este projeto é um exemplo simples em Java que utiliza a biblioteca [Gson](https://github.com/google/gson) para converter objetos em JSON. O programa permite ao usuário inserir informações de pessoas (nome e idade) via terminal, armazenando-as em uma lista e, ao final, exibindo todos os dados inseridos em formato JSON.

## Estrutura do Projeto

```
├── pom.xml
├── README.md
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   └── Main.java
```

- [`src/main/java/org/example/Main.java`](src/main/java/org/example/Main.java): Código-fonte principal do programa.
- [`pom.xml`](pom.xml): Arquivo de configuração do Maven, incluindo dependências.
- [`README.md`](README.md): Este arquivo de documentação.

## Como Executar

1. **Pré-requisitos**
   - Java 23 ou superior instalado.
   - Maven instalado.

2. **Instalar dependências**
   ```sh
   mvn clean install
   ```

3. **Executar o programa**
   ```sh
   mvn exec:java -Dexec.mainClass="org.example.Main"
   ```

## Funcionamento

Ao executar, o programa solicita ao usuário que insira o nome e a idade de cada pessoa. Para encerrar a entrada de dados, digite `FIM` como nome.

Exemplo de uso:
```
Digite o nome (ou FIM para encerrar): Gabriel
Digite a idade: 25
Digite o nome (ou FIM para encerrar): Ana
Digite a idade: 30
Digite o nome (ou FIM para encerrar): FIM
Objeto(s) convertido(s) para JSON:
[{"nome":"Gabriel","idade":25},{"nome":"Ana","idade":30}]
```

## Dependências

- [Gson](https://github.com/google/gson) para serialização de objetos Java em JSON.

## Autor

Exercício desenvolvido para a disciplina C14.

## Licença

Este projeto é apenas para fins educacionais.