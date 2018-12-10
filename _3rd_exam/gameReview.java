public class GameReview {
  // fields;
  private String name; // not null
  private String developer; // not null
  private int graphics; // 1-5 rating

  public GameReview(String initialName, String initialDeveloper, int initialGraphics) {
    setIniValue(initialName, initialDeveloper, initialGraphics);
  }

  public void setInitialValues(String newName, String newDeveloper, int newGraphics) {
    if(newName == null || newDeveloper == null || newGraphics <1 || newGraphics > 5) {
      throw new IllegalArgumentException();
    }
    this.name = newName;
    this.developer = newDeveloper;
    this.graphics = newGraphics;
  }
  public String getName() {
    return this.name;
  }
  public String getDeveloper() {
    return this.developer;
  }
  public int getGraphics() {
    return this.graphics;
  }
  public String toString() {
    return ("The name is: " + getName() + ".  The developer is: " + getDeveloper() + ".  The rating is: " + getGraphics());
  }
}
