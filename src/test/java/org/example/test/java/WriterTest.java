package org.example.test.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.manager.Writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class WriterTest {

    @BeforeEach
    void setUp() throws IOException{
        Writer.writeCSV();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void writeCSV() throws IOException {
        try (FileReader expectedReader = new FileReader("src/main/resources/expected.csv");
             BufferedReader expectedBR = new BufferedReader(expectedReader);
             FileReader actualReader = new FileReader("src/main/resources/result.csv");
             BufferedReader actualBR = new BufferedReader(actualReader)) {
            String line1 = expectedBR.readLine();
            String line2 = actualBR.readLine();
            Assertions.assertEquals(line1, line2);
        }
    }
}


