package iterator;

public class HandHeldInventoryIterator implements InventoryIterator {
	private HandHeldInventory inventory;
	
	private int index = 1;
	
	
	
	/**
	 * Must be passed a concrete class.
	 */
	public HandHeldInventoryIterator (HandHeldInventory inventory) {
		this.inventory = inventory;
	}
	
	
	
	@Override
	public boolean isDone() {
		if (this.index < 2) {
			return false;
		}
		
		return true;
	}

	@Override
	public void next() {
		this.index += 1; 
	}

	@Override
	public Item current() {
		Item item = null;
		
		if (this.index == 1) {
			item = this.inventory.getLeft();
		}
		if (this.index == 2) {
			item = this.inventory.getRight();
		}
		
		return item;
	}

}
