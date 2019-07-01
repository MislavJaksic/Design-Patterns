package bridge.page;

import bridge.theme.Theme;

public class Main extends Page {
	public Main(Theme theme) {
		super(theme);
	}

	@Override
	public String show() {
		return "main " + this.theme.getStyle();
	}
}
