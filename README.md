# Demonstração de Formatação de Datas e Horários em Java

Este projeto consiste em um programa Java simples que demonstra diferentes maneiras de formatar objetos de data e hora (`LocalDate`, `LocalDateTime`, `Instant`) utilizando a classe `DateTimeFormatter` do pacote `java.time`. O código mostra como aplicar formatos predefinidos e formatos personalizados para representar datas e horários como strings.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o método `main`, onde as diversas operações de formatação de datas e horários são demonstradas.

## Como Usar

1.  **Salve o arquivo:** Salve o código fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile o arquivo Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Resultado:** O programa exibirá no console oito linhas, cada uma representando a formatação de um objeto de data ou hora diferente utilizando um `DateTimeFormatter` específico.

## Explicação do Código

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa e demonstra a formatação de datas e horários.

* **Método `main`:**
    1.  **Criação de objetos de data e hora:** São criados objetos de diferentes classes do `java.time` para demonstrar a formatação:
        * `LocalDate d01 = LocalDate.now()`: Obtém a data atual.
        * `LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26")`: Cria um objeto `LocalDateTime` a partir de uma string no formato ISO 8601.
        * `Instant d03 = Instant.parse("2022-07-20T01:30:26Z")`: Cria um objeto `Instant` a partir de uma string no formato ISO 8601 UTC.
    2.  **Criação de `DateTimeFormatter`:** São criados diversos objetos `DateTimeFormatter` para especificar diferentes formatos de saída:
        * `DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy")`: Define um formato personalizado para data no padrão dia/mês/ano.
        * `DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")`: Define um formato personalizado para data e hora no padrão dia/mês/ano hora:minuto:segundo.
        * `DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault())`: Define um formato personalizado para data e hora com a informação do timezone do sistema.
        * `DateTimeFormatter dtf4 = DateTimeFormatter.ISO_DATE_TIME`: Utiliza um formato predefinido para data e hora no padrão ISO.
        * `DateTimeFormatter dtf5 = DateTimeFormatter.ISO_INSTANT`: Utiliza um formato predefinido para instante no padrão ISO.
    3.  **Formatação e impressão:** As seguintes linhas demonstram a formatação dos objetos de data e hora utilizando os diferentes formatadores:
        * `System.out.println("d01 = " + d01.format(dtf))`: Formata `d01` (LocalDate) usando o formato `dtf`.
        * `System.out.println("d01 = " + dtf.format(d01))`: Outra forma de formatar `d01` usando o formato `dtf`.
        * `System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))`: Formata `d01` usando um padrão de formato criado diretamente na chamada do método.
        * `System.out.println("d02 = " + d02.format(dtf))`: Formata `d02` (LocalDateTime) usando o formato `dtf` (apenas a parte da data será formatada).
        * `System.out.println("d02 = " + d02.format(dtf2))`: Formata `d02` usando o formato `dtf2`.
        * `System.out.println("d02 = " + d02.format(dtf4))`: Formata `d02` usando o formato predefinido `dtf4` (ISO date-time).
        * `System.out.println("d03 = " + dtf3.format(d03))`: Formata `d03` (Instant) usando o formato `dtf3`, que inclui o timezone do sistema.
        * `System.out.println("d03 = " + dtf5.format(d03))`: Formata `d03` usando o formato predefinido `dtf5` (ISO instant).
