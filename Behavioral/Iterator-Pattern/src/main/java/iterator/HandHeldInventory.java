package iterator;

public class HandHeldInventory implements Inventory {
	private Item right;
	private Item left;
	
	
	
	public HandHeldInventory (Item left, Item right) {
		this.left = left;
		this.right = right;
	}
	
	
	
	public Item getRight() {
		return right;
	}

	private void setRight(Item right) {
		this.right = right;
	}

	public Item getLeft() {
		return left;
	}

	private void setLeft(Item left) {
		this.left = left;
	}

	
	
	@Override
	public InventoryIterator getIterator() {
		return new HandHeldInventoryIterator(this);
	}
}
