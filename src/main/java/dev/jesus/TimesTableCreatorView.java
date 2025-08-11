package dev.jesus;

public class TimesTableCreatorView {

  int factor;

  public TimesTableCreatorView(int factor) {
    this.factor = factor;
  }

  public void showTimesTable(TimesTableCreator timesTableCreator) {
    for (int i = 0; i <= 10; i++) {
      System.out.println(timesTableCreator.createTimesTable());
    }
  }
}
