
public class HashFunc {
  public String hash(String text) {
    int sum = 0;
    char chArr[] = text.toCharArray();
    for (char c : chArr) {
      int value = c;
      sum += value;
    }
    return String.valueOf(sum % 256);
  }
}
