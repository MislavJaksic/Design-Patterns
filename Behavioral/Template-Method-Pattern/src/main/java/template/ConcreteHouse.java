package template;

public class ConcreteHouse extends House {
	@Override
	public String buildWalls() {
		return "concrete walls";
	}

	@Override
	public String buildRoof() {
		return "concrete roof";
	}

}
