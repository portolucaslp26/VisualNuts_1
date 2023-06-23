package test;
import main.java.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main(new String[0]);

        String output = outputStream.toString().trim();

        System.setOut(System.out);

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

        assertEquals(expectedOutput, output);
    }
}