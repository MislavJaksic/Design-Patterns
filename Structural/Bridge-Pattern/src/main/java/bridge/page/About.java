package bridge.page;

import bridge.theme.Theme;

public class About extends Page {
	public About(Theme theme) {
		super(theme);
	}

	@Override
	public String show() {
		return "about " + this.theme.getStyle();
	}
}
