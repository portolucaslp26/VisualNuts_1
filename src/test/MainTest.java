package test;
import main.java.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        // Redireciona a saída padrão para um fluxo de saída em memória
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Executa o método main
        Main.main(new String[0]);

        // Obtém a saída do sistema e remove os espaços em branco extras
        String output = outputStream.toString().trim();

        // Restaura a saída padrão
        System.setOut(System.out);

        // Define a saída esperada com os separadores de linha e linhas em branco adicionados
        StringBuilder expectedOutputBuilder = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                expectedOutputBuilder.append("Visual Nuts");
            } else if (i % 3 == 0) {
                expectedOutputBuilder.append("Visual");
            } else if (i % 5 == 0) {
                expectedOutputBuilder.append("Nuts");
            } else {
                expectedOutputBuilder.append(i);
            }
            expectedOutputBuilder.append(System.lineSeparator());
        }
        String expectedOutput = expectedOutputBuilder.toString().trim();

        // Verifica se a saída está correta
        assertEquals(expectedOutput, output);
    }
}