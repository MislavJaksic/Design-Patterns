package factory;

import ui.Alert;
import ui.Button;

public interface UiAbstractFactory {
  public Button getButton();
  public Alert getAlert();
}
