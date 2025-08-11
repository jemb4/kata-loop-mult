package dev.jesus;

public class TimesTableCreatorController {

  private int factor = 5;

  public TimesTableCreatorController() {
    index();
  }

  public void index() {
    TimesTableCreatorView timesTableCreatorView = new TimesTableCreatorView(factor);
    TimesTableCreator timesTableCreator = new TimesTableCreator(factor);

    timesTableCreatorView.showTimesTable(timesTableCreator);
  }
}
