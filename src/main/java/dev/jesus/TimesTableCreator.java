package dev.jesus;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class TimesTableCreator {

  private int factor1;

  public TimesTableCreator(int factor1) {
    this.factor1 = factor1;
  }

  public List<String> createTimesTable() {
    List<String> table = new ArrayList<>(10);

    for (int factor2 = 1; factor2 <= 10; factor2++) {
      int multiplicationResult = factor1 * factor2;
      table.add(MessageFormat.format("{0} x {1} = {2}", factor1, factor2, multiplicationResult));
    }

    return table;
  }
}