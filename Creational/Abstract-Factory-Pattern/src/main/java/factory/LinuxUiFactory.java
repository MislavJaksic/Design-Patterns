package factory;

import ui.Alert;
import ui.Button;
import ui.LinuxAlert;
import ui.LinuxButton;

public class LinuxUiFactory implements UiAbstractFactory {
	@Override
	public Button getButton() {
		return new LinuxButton();
	}

	@Override
	public Alert getAlert() {
		return new LinuxAlert();
	}

}
