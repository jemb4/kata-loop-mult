package dev.jesus;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TimesTableCreatorTest {

  private TimesTableCreator timesTableCreator;

  @BeforeEach
  void setUp() {
    timesTableCreator = new TimesTableCreator(3);
  }

  @Test
  void createTimesTableTest() {
    String expected = "3 x 1 = 3";

    List<String> result = timesTableCreator.createTimesTable();

    assertTrue(result.contains(expected));
  }
}
