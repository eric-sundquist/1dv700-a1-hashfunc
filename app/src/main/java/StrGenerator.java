import java.util.Random;

public class StrGenerator {
  Random r = new Random();

  public String genStr() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < r.nextInt(1800); i++) {
      sb.append(genRandomChar());
    }
    return sb.toString();
  }

  private char genRandomChar() {
    // gen random char between ascii value 32 - 126
    return (char) (r.nextInt(95) + 32);
  }
}
