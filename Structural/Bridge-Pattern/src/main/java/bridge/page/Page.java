package bridge.page;

import bridge.theme.Theme;

/**
 * Abstraction.
 */
abstract class Page {
	Theme theme;
	
	
	
	public Page(Theme theme) {
		this.theme = theme;
	}
	
	
	
	public abstract String show();
}