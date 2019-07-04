package template;

public abstract class House {
  /**
   * Template method.
   */
  public String build() {
	  return this.buildWalls() + " " + this.buildRoof();
  }
  
  abstract public String buildWalls();
  abstract public String buildRoof();
}
