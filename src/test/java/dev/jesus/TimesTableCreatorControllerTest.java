package dev.jesus;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TimesTableCreatorControllerTest {

  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @AfterEach
  void tearDown() {
    System.setOut(standardOut);
  }

  @Test
  void testController() {
    String[] contains = new String[] {
        "5 x 1 = 5",
        "5 x 5 = 25",
        "5 x 10 = 50"
    };

    TimesTableCreatorController timesTableCreatorController = new TimesTableCreatorController();
    timesTableCreatorController.index();

    for (String string : contains) {
      assertTrue(outputStreamCaptor.toString().contains(string));
    }
  }
}
