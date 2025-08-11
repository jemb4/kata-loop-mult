package dev.jesus;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TimesTableCreatorViewTest {

  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outpuStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  void setUp() {
    System.setOut(new PrintStream(outpuStreamCaptor));
  }

  @AfterEach
  void tearDown() {
    System.setOut(standardOut);
  }

  @Test
  void testView() {
    String[] contains = new String[] {
        "3 x 1 = 3",
        "3 x 5 = 15",
        "3 x 10 = 30"
    };

    TimesTableCreatorView timesTableCreatorView = new TimesTableCreatorView(3);
    timesTableCreatorView.showTimesTable(new TimesTableCreator(3));

    for (String string : contains) {
      System.out.println(string);
      assertTrue(outpuStreamCaptor.toString().contains(string));
    }
  }
}