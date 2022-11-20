package com.dio;

import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class PessoaTest {

    // Primeira coisa a ser executada no teste
    @BeforeAll
    public static void start() {
        /// faz alguma coia
    }

    // Executa o metodo antes de cada teste
    @BeforeEach
    public static void seedData() {

    }

    // Executa o método após cada teste executado
    @AfterEach
    public static void cleanData() {

    }

    // Última coisa a ser executada na classe de teste
    @AfterAll
    public static void stop() {
        /// termina tudo
    }

    @Test
    void ValidateIdate() {
        Pessoa pessoa = new Pessoa("Pessoa 1", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(pessoa.isMaiorIdade());

        pessoa = new Pessoa("Pessoa 2", LocalDate.of(2015, 1, 1));
        Assertions.assertFalse(pessoa.isMaiorIdade());

        // Ordem dos valores no assert
        // Sempre o primeiro parãmetro dever ser o valor esperado e o segundo o
        // resultado da operação a ser testada
        // Exemplo
        // Assertions.assertEquals(18, pessoa.getIdade());

        // Asserts
        // Assertions.assertArrayEquals(null, null); // Valida se dois arrays são iguais
        // Assertions.assertNotNull(...)
        // Assertions.assertNull(...);
        // Assertions.assertEquals(..)

        // IMPORTAÇÃO STÁTICA
        // Auxilia para evitar a necessidade de utilizar 'Assertions.'
        // Para isso, a importação deverá ser da seguinte forma:

        // import static org.junit.jupiter.api.Assertions.[assertNull];
        // import static org.junit.jupiter.api.Assertions.[assertNotNull];
        // import static org.junit.jupiter.api.Assertions.[assertEquals];
        // import static org.junit.jupiter.api.Assertions.[assertFalse];
        // ou
        // import static org.junit.jupiter.api.Assertions.*;

        // ....
        // Após esse método de importação, a utilização passa a ser:
        // assertNotNull(object) , no lugar de Assertions.assertNotNull(object)

        // Assumptions.assumeFalse()
        // Assumptions.assumeTrue()
        // Assumptions.assumeEquals()

        // TESTANDO EXCEPTIONS
        // 1 - Assertions.assertThrows([CLASSE DE EXCEPTION], () => OBJ.METODO QUE VAI LANÇAR O ERRO))
        // 2 - Assertions.assertDoesNotThrow(() => OBJ.METODO QUE PODE LANÇAR O ERRO))

        // ORDENAÇÃO DE TESTES
        // na declaração da classe, colocar a anotação
        // @TestMethodOrder(MethodOrderer.class)
        //       -> a antação @Order([ordem]) deve ser de definida em cada classe     
        //  MethodOrderer -> tem as opções de ordenação, como nome do método, display name (@DisplayName("name"))
        //            aleatório...


        // BOAS PRÁTICAS
        // - Simplicidade
        //    - Nome dos métodos
        //    - Facilidade de leitura
        //    - Veja um pouco sobre TDD, tente começar a escrever o teste sempre junto com o código
        //  - Padronização
        //    - Nomenclatura única para todos os testes no time
        //  - Deve ser determinístico, sempre deve ter o mesmo resultado
        //  - Ferramenta de cobertura de teste (Jacoco) 

        //Slides: https://docs.google.com/presentation/d/1XJfYH_8L2d79y1PbSust98XP19BJf8r3/edit?rtpof=true&sd=true

    }

    // Esse teste somente será executado caso a variável de ambiente ENV seja igual
    // a PRODUCTION
    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "PRODUCTION")
    void executarSomenteSeProducao() {
        // ...
    }

    // Esse teste somente será executado caso a variável de ambiente ENV seja
    // diferente
    // a PRODUCTION
    @Test
    @DisabledIfEnvironmentVariable(named = "ENV", matches = "PRODUCTION")
    void executarSomenteSeNaoProducao() {
        // ...
    }

    @Test
    @EnabledOnOs(OS.WINDOWS) // executa apenas para o SO escolhido
    void so() {
        // ...
    }

    @Test
    // @EnabledOnJre(JRE.JAVA_10) // executa apenas se a JRE for a definida
    // @EnabledForJreRange() // define um range de jre para executar o código
    void jre() {
        // ...
    }

}
