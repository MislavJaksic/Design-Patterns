package factory;

import ui.Alert;
import ui.Button;
import ui.WindowsAlert;
import ui.WindowsButton;

public class WindowsUiFactory implements UiAbstractFactory {
	@Override
	public Button getButton() {
		return new WindowsButton();
	}

	@Override
	public Alert getAlert() {
		return new WindowsAlert();
	}

}
