import java.util.Random;

public interface Incrementable {
  public int increment();
  public int getValue();
}

// Sequential Incrementer
public class Sequential_Incrementer implements Incremental {
  private int initial;
  public Sequential_Incrementer() {
    this.initial = 0;
  }
  public int increment() {
    return this.initial++;
  }
  public int getValue() {
    return this.initial;
  }
}

public class RandomIncrement implements Incremental {
  private int rand;
  public RandomIncrement() {
    this.rand = (int)(Math.random() * 100);
  }
  public int increment() {
    return this.rand;
  }
  public int getValue() {
    return this.rand;
  }
}