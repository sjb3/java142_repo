public class GameReview {
  // fields;
  private String name;
  private String developer;
  private int graphics; // 1-5 rating

  public GameReview(String initName, String initDeveloper, int initGraphics) {
    setIniValue(initName, initDeveloper, initGraphics);
  }

  public void setInitValie(String newName, String newDeveloper, int newGraphics) {
    if(newName == null || newDeveloper == null || newGraphics <=0 || newGraphics >=6) {
      throw new IllegalArgumentException();
    }
    this.name = newName;
    this.developer = newDeveloper;
    this.graphics = newGraphics;
  }
  public String getName() {
    return name;
  }
  public String getDeveloper() {
    return developer;
  }
  public int getGraphics() {
    return graphics;
  }
  public String toString() {
    return (...);
  }
}